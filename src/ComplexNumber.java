import org.jetbrains.annotations.NotNull;

/**
 * Defines a complex number with real and imaginary parts.
 */
public class ComplexNumber {
    private final int re;  // Real part of the complex number
    private final int im;  // Imaginary part of the complex number

    /**
     * Constructs a new ComplexNumber with the specified real and imaginary parts.
     *
     * @param re the real part
     * @param im the imaginary part
     */
    public ComplexNumber(int re, int im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Adds this complex number to another complex number.
     *
     * @param other the complex number to add
     * @return a new ComplexNumber representing the sum
     */
    public ComplexNumber add(@NotNull ComplexNumber other) {
        return new ComplexNumber(re + other.re, im + other.im);
    }

    /**
     * Subtracts another complex number from this complex number.
     *
     * @param other the complex number to subtract
     * @return a new ComplexNumber representing the difference
     */
    public ComplexNumber subtract(@NotNull ComplexNumber other) {
        return new ComplexNumber(re - other.re, im - other.im);
    }

    /**
     * Multiplies this complex number by another complex number.
     *
     * @param other the complex number to multiply by
     * @return a new ComplexNumber representing the product
     */
    public ComplexNumber multiply(@NotNull ComplexNumber other) {
        int realPart = re * other.re - im * other.im;
        int imaginaryPart = re * other.im + im * other.re;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    /**
     * Divides this complex number by another complex number.
     *
     * @param other the complex number to divide by
     * @return a new ComplexNumber representing the quotient
     * @throws ArithmeticException if attempting to divide by zero
     */
    public ComplexNumber divide(@NotNull ComplexNumber other) {
        int denominator = other.re * other.re + other.im * other.im;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int realPart = (re * other.re + im * other.im) / denominator;
        int imaginaryPart = (im * other.re - re * other.im) / denominator;

        return new ComplexNumber(realPart, imaginaryPart);
    }

    /**
     * Returns the conjugate of this complex number.
     *
     * @return a new ComplexNumber representing the conjugate
     */
    public ComplexNumber conjugate() {
        return new ComplexNumber(re, -im);
    }

    /**
     * Returns a string representation of the complex number.
     *
     * @return a string in the form "a + bi" or "a - bi"
     */
    @Override
    public String toString() {
        return re + (im >= 0 ? " + " : " - ") + Math.abs(im) + " * i";
    }
}
