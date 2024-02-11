package cc.tkmr.screenmatch.exceptions;

/**
 * This class is used to represent an error that occurs during the conversion of a year to a different calendar system.
 *
 * @author DanielTikamori
 */
public class YearConversionExceptionError extends RuntimeException {

    /**
     * The error message.
     */
    private String message;

    /**
     * Creates a new instance of the YearConversionExceptionError class with the specified error message.
     *
     * @param message The error message.
     */
    public YearConversionExceptionError(String message) {
        this.message = message;
    }

    /**
     * Gets the error message.
     *
     * @return The error message.
     */
    @Override
    public String getMessage() {
        return this.message;
    }

}
