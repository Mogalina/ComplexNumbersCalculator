package models;

import enums.Operation;

/**
 * Abstract class representing an arithmetic expression involving complex numbers.
 * <p>
 * The class follows the Template Method Design Pattern, where the method {@link #execute()} implements a general
 * algorithm that sequentially applies operations on complex numbers, delegating the actual operation to the subclass
 * through the {@link #executeOneOperation(ComplexNumber, ComplexNumber)} method.
 */
public abstract class ComplexExpression {

    /** The operation to be performed on the complex numbers */
    protected Operation operation;

    /** Array of complex numbers involved in the expression */
    protected ComplexNumber[] args;

    /**
     * Constructor to initialize the complex expression with a specific operation and a list of complex numbers as
     * arguments.
     *
     * @param operation the operation to be performed
     * @param args the array of complex numbers to which the operation will be applied
     */
    public ComplexExpression(Operation operation, ComplexNumber[] args) {
        this.operation = operation;
        this.args = args;
    }

    /**
     * Executes the complex expression by sequentially applying the specified operation on all complex numbers provided
     * as arguments.
     * <p>
     * This method starts with the first complex number in the array and applies the operation pairwise on the
     * remaining numbers.
     *
     * @return the result of the complex expression after applying the operatios on all provided complex numbers
     */
    public ComplexNumber execute() {
        // Initialize result with the first complex number
        ComplexNumber result = args[0];

        // Sequentially apply the operation on the remaining complex numbers
        for (int i = 1; i < args.length; i++) {
            result = executeOneOperation(result, args[i]);
        }

        return result;
    }

    /**
     * Abstract method to perform a single operation between two complex numbers.
     *
     * @param c1 the first complex number
     * @param c2 the second complex number
     * @return the result of applying the operation on c1 and c2
     */
    protected abstract ComplexNumber executeOneOperation(ComplexNumber c1, ComplexNumber c2);
}
