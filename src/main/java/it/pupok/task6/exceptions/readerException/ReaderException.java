package it.pupok.task6.exceptions.readerException;

import java.io.IOException;

/**
 * ReaderException class
 */
public class ReaderException extends IOException {

    /**
     * Constructor
     * @param e incoming argument
     */
    public ReaderException(final IOException e) {
        initCause(e);
    }
}