package it.pupok.task6.reader;

import it.pupok.task6.exceptions.readerException.ReaderException;

import java.util.ArrayList;

/**
 * Interface for to describe signature the method of readCode
 */
public interface ICodeReader {

    /**
     * readCode
     * @return ArrayList<Character>
     * @throws ReaderException
     */
    ArrayList<Character> readCode() throws ReaderException;
}
