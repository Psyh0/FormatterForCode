package it.pupok.task6.writerOfCode.writerToFile;

import it.pupok.task6.writerOfCode.iWriterToFile.IWriterToFile;

import java.io.*;

/**
 * class WriterToFile
 * implements interface IWriterToFile
 */
public class WriterToFile implements IWriterToFile {

    private static OutputStream fileStream;

    /**
     * writeCode
     * @param outputCode incoming parameter
     * @throws IOException
     */
    public void writeCode(final String outputCode) throws IOException {
        try {
            fileStream = new FileOutputStream((new File("src//main//resources//outputCode.txt")));
            PrintStream printStream = new PrintStream(fileStream);
            printStream.print(outputCode);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileStream.close();
        }
    }
}
