package it.pupok.task6.writerToFile;

import java.io.IOException;

/**
 * Interface for to describe signature the method of writeCode class WriterToFile
 */
public interface IWriterToFile {

    /**
     * writeCode
     * @param s incoming argument
     * @throws IOException
     */
    void writeCode(String s) throws IOException;
}