package models;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class responsible for parsing complex number expressions from CLI.
 */
public class ExpressionParser {
    private static final Pattern COMPLEX_NUMBER_PATTERN = Pattern.compile("([-+]?\\d+)([-+]?\\d+)\\*i");

    /**
     * Parses the command line arguments representing a complex number expression.
     *
     * @param args CLI arguments containing the complex number expression
     * @return the result of the evaluated complex number expression
     * @throws IllegalArgumentException if the input format is invalid
     */
    public ComplexNumber parse(String @NotNull [] args) {
        // Initialize an array to store the complex numbers / operands
        ComplexNumber[] numbers = new ComplexNumber[args.length / 2 + 1];

        // Initialize an array to store the operators
        String[] operators = new String[args.length / 2];

        int numberIndex = 0;
        int operatorIndex = 0;

        // Iterate through the arguments to separate numbers / operands and operators
        for (String arg : args) {
            arg = arg.trim();  // Trim whitespace

            // Check if the argument is a complex number / operand or an operator
            if (isComplexNumber(arg)) {
                numbers[numberIndex++] = parseComplexNumber(arg);
            } else if (isOperator(arg)) {
                operators[operatorIndex++] = arg;
            } else {
                throw new IllegalArgumentException("Invalid input format: " + arg);
            }
        }

        // Evaluate the expression
        ComplexExpression expression = createExpression(numbers, operators);

        return expression.execute();
    }

    /**
     * Checks if the given string is a valid complex number.
     *
     * @param str the string to check
     * @return true if it matches the complex number format, false otherwise
     */
    private boolean isComplexNumber(String str) {
        return COMPLEX_NUMBER_PATTERN.matcher(str).matches() || str.matches("[-+]?\\d+");
    }

    /**
     * Parses a complex number from a string and returns a models.ComplexNumber object.
     *
     * @param str the string representing a complex number
     * @return the parsed models.ComplexNumber {@link ComplexNumber}
     * @throws IllegalArgumentException if the format is invalid
     */
    private ComplexNumber parseComplexNumber(String str) {
        Matcher matcher = COMPLEX_NUMBER_PATTERN.matcher(str);

        if (matcher.matches()) {
            int re = Integer.parseInt(matcher.group(1));  // Real part
            int im = Integer.parseInt(matcher.group(2));  // Imaginary part

            return new ComplexNumber(re, im);
        }

        throw new IllegalArgumentException("Invalid complex number format: " + str);
    }

    /**
     * Checks if the given string is a valid operator.
     *
     * @param str the string to check
     * @return true if it is a valid operator, false otherwise
     */
    private boolean isOperator(@NotNull String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    /**
     * Creates an instance of {@link ComplexExpression} based on the parsed complex numbers and operators.
     *
     * @param numbers   the array of ComplexNumbers {@link ComplexExpression}
     * @param operators the array of operators
     * @return the models.ComplexExpression representing the operation to be executed
     */
    private ComplexExpression createExpression(ComplexNumber @NotNull [] numbers, String @NotNull [] operators) {
        // Compose expression starting with first complex number / operand
        ComplexExpression expression = new AdditionExpression(new ComplexNumber[]{numbers[0]});

        for (int i = 0; i < operators.length; i++) {
            String operator = operators[i];
            ComplexNumber nextNumber = numbers[i + 1];

            expression = switch (operator) {
                case "+" -> new AdditionExpression(new ComplexNumber[]{expression.execute(), nextNumber});
                case "-" -> new SubtractionExpression(new ComplexNumber[]{expression.execute(), nextNumber});
                case "*" -> new MultiplicationExpression(new ComplexNumber[]{expression.execute(), nextNumber});
                case "/" -> new DivisionExpression(new ComplexNumber[]{expression.execute(), nextNumber});
                default -> throw new IllegalArgumentException("Unknown operator: " + operator);
            };
        }

        return expression;
    }
}
