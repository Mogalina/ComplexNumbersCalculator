/**
 * Class representing a complex addition expression.
 * <p>
 * This class extends the {@link ComplexExpression} class and is responsible for executing addition operations on
 * complex numbers. It overrides the {@link #executeOneOperation(ComplexNumber, ComplexNumber)} method to perform
 * addition on two complex numbers.
 */
public class AdditionExpression extends ComplexExpression {

    /**
     * Constructor that initializes an addition expression with the given complex numbers.
     * <p>
     * The constructor calls the parent constructor {@link ComplexExpression#ComplexExpression(Operation,
     * ComplexNumber[])} to set the operation to {@link Operation#ADDITION} and store the complex numbers as arguments.
     *
     * @param args the array of complex numbers to be added together
     */
    public AdditionExpression(ComplexNumber[] args) {
        super(Operation.ADDITION, args);
    }

    /**
     * Performs the addition of two complex numbers.
     * <p>
     * This method overrides the {@link ComplexExpression#executeOneOperation(ComplexNumber, ComplexNumber)}
     * method to return the result of adding two complex numbers using the {@link ComplexNumber#add(ComplexNumber)}
     * method.
     *
     * @param c1 the first complex number
     * @param c2 the second complex number
     * @return the result of adding c1 and c2
     */
    @Override
    protected ComplexNumber executeOneOperation(ComplexNumber c1, ComplexNumber c2) {
        return c1.add(c2);
    }
}
