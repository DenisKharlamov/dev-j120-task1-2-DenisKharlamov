package stringservice;

/**
 * Класс исключения для работы с массивами строк.
 */
public class StringArrayException extends Exception{
    private static final String DEFAULT_DESCRIPTION
            = "Common error";
    /**
     * Конструктор по умолчанию.
     */
    public StringArrayException() {
        super(DEFAULT_DESCRIPTION);
    }
    /**
     * Конструктор с описание причины возникновения исключения.
     *
     * @param string описание причины возникновения исключения.
     */
    public StringArrayException(String string) {
        super(string);
    }
}
