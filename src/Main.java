/**
 * Main class to execute the complex number calculator. This class serves as the entry point for the application.
 */
public class Main {

    /**
     * The main method that runs the complex number calculator.
     *
     * @param args command line arguments that represent the complex number expression
     */
    public static void main(String[] args) {
        // Check if any input arguments are provided
        if (args.length == 0) {
            System.err.println("[ERROR] No input provided");
            return;
        }

        // Create an instance of ExpressionParser to handle the parsing and evaluation
        ExpressionParser parser = new ExpressionParser();

        try {
            // Parse the expression and calculate the result
            ComplexNumber result = parser.parse(args);

            System.out.println("\nExpression result = " + result);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
        }
    }
}
