package factory;

import enums.Operation;
import models.*;
import org.jetbrains.annotations.NotNull;

/**
 * Singleton class responsible for creating instances of {@link ComplexExpression} based on the provided operation type.
 * <p>
 * It ensures that only one instance of {@code ExpressionFactory} is created during the application's lifetime
 * and provides a method to generate different types of complex arithmetic expressions based on the input operation.
 */
public class ExpressionFactory {

    /** The single instance of the factory  */
    private static ExpressionFactory instance = null;

    /**
     * Private constructor to prevent external instantiation. This ensures that the class can only be instantiated
     * within itself.
     */
    private ExpressionFactory() {}

    /**
     * Returns the single instance of the {@code ExpressionFactory} class.
     * <p>
     * This method ensures lazy initialization. The instance is created only when it is first requested.
     *
     * @return the singleton instance of {@code ExpressionFactory}
     */
    public static ExpressionFactory getInstance() {
        if (instance == null) {
            instance = new ExpressionFactory();
        }

        return instance;
    }

    /**
     * Creates a {@link ComplexExpression} based on the provided {@link Operation} and complex number arguments.
     * <p>
     * This method uses a {@code switch} expression to determine which type of {@link ComplexExpression}
     * to create.
     *
     * @param operation the arithmetic operation to be performed
     * @param args the array of {@link ComplexNumber} objects involved in the operation
     * @return the appropriate {@link ComplexExpression} based on the operation type
     * @throws IllegalArgumentException if the operation is unknown or not supported
     */
    public ComplexExpression createExpression(@NotNull Operation operation, ComplexNumber[] args) {
        return switch (operation) {
            case ADDITION -> new AdditionExpression(args);
            case SUBTRACTION -> new SubtractionExpression(args);
            case MULTIPLICATION -> new MultiplicationExpression(args);
            case DIVISION -> new DivisionExpression(args);
            default -> throw new IllegalArgumentException("Unknown operation");
        };
    }
}
