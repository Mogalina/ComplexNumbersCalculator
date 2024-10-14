package models;

import enums.Operation;
import org.jetbrains.annotations.NotNull;

/**
 * Class representing a complex division expression.
 * <p>
 * This class extends the {@link ComplexExpression} class and is responsible for executing division operations on
 * complex numbers. It overrides the {@link #executeOneOperation(ComplexNumber, ComplexNumber)} method to perform
 * division between two complex numbers.
 */
public class DivisionExpression extends ComplexExpression {

    /**
     * Constructor that initializes a division expression with the given complex numbers.
     * <p>A
     * The constructor calls the parent constructor {@link ComplexExpression#ComplexExpression(Operation,
     * ComplexNumber[])} to set the operation to {@link Operation#DIVISION} and store the complex numbers as arguments.
     *
     * @param args the array of complex numbers to be divided
     */
    public DivisionExpression(ComplexNumber[] args) {
        super(Operation.DIVISION, args);
    }

    /**
     * Performs the division of two complex numbers.
     * <p>
     * This method overrides the {@link ComplexExpression#executeOneOperation(ComplexNumber, ComplexNumber)} method to
     * return the result of dividing the first complex number by the second using the
     * {@link ComplexNumber#divide(ComplexNumber)} method.
     *
     * @param c1 the first complex number
     * @param c2 the second complex number
     * @return the result of dividing c1 by c2
     * @throws ArithmeticException if c2 is zero (division by zero)
     */
    @Override
    protected ComplexNumber executeOneOperation(@NotNull ComplexNumber c1, ComplexNumber c2) {
        return c1.divide(c2);
    }
}
