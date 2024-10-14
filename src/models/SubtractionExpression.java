package models;

import enums.Operation;

/**
 * Class representing a complex subtraction expression.
 * <p>
 * This class extends the {@link ComplexExpression} class and is responsible for executing subtraction operations on
 * complex numbers. It overrides the {@link #executeOneOperation(ComplexNumber, ComplexNumber)} method to perform
 * subtraction between two complex numbers.
 */
public class SubtractionExpression extends ComplexExpression {

    /**
     * Constructor that initializes a subtraction expression with the given complex numbers.
     * <p>
     * The constructor calls the parent constructor {@link ComplexExpression#ComplexExpression(Operation,
     * ComplexNumber[])} to set the operation to {@link Operation#SUBTRACTION} and store the complex numbers as
     * arguments.
     *
     * @param args the array of complex numbers to be subtracted
     */
    public SubtractionExpression(ComplexNumber[] args) {
        super(Operation.SUBTRACTION, args);
    }

    /**
     * Performs the subtraction of two complex numbers.
     * <p>
     * This method overrides the {@link ComplexExpression#executeOneOperation(ComplexNumber, ComplexNumber)} method to
     * return the result of subtracting the second complex number from the first using the
     * {@link ComplexNumber#subtract(ComplexNumber)} method.
     *
     * @param c1 the first complex number
     * @param c2 the second complex number
     * @return the result of subtracting c2 from c1
     */
    @Override
    protected ComplexNumber executeOneOperation(ComplexNumber c1, ComplexNumber c2) {
        return c1.subtract(c2);
    }
}
