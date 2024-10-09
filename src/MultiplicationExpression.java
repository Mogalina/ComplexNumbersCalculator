/**
 * Class representing a complex multiplication expression.
 * <p>
 * This class extends the {@link ComplexExpression} class and is responsible for executing multiplication operations on
 * complex numbers. It overrides the {@link #executeOneOperation(ComplexNumber, ComplexNumber)} method to perform
 * multiplication of two complex numbers.
 */
public class MultiplicationExpression extends ComplexExpression {

    /**
     * Constructor that initializes a multiplication expression with the given complex numbers.
     * <p>
     * The constructor calls the parent constructor {@link ComplexExpression#ComplexExpression(Operation,
     * ComplexNumber[])} to set the operation to {@link Operation#MULTIPLICATION} and store the complex numbers as
     * arguments.
     *
     * @param args the array of complex numbers to be multiplied
     */
    public MultiplicationExpression(ComplexNumber[] args) {
        super(Operation.MULTIPLICATION, args);
    }

    /**
     * Performs the multiplication of two complex numbers.
     * <p>
     * This method overrides the {@link ComplexExpression#executeOneOperation(ComplexNumber, ComplexNumber)} method to
     * return the result of multiplying two complex numbers using the {@link ComplexNumber#multiply(ComplexNumber)}
     * method.
     *
     * @param c1 the first complex number
     * @param c2 the second complex number
     * @return the result of multiplying c1 and c2
     */
    @Override
    protected ComplexNumber executeOneOperation(ComplexNumber c1, ComplexNumber c2) {
        return c1.multiply(c2);
    }
}
