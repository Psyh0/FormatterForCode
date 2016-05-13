package it.pupok.task6.main;

import it.pupok.task6.codeFormatter.codeFormatter.CodeFormatter;
import it.pupok.task6.reader.console.ConsoleReader;
import it.pupok.task6.reader.file.InputFileReader;
import it.pupok.task6.exceptions.missingBracketException.MissingBracketException;
import it.pupok.task6.writerToFile.impl.WriterToFile;

import java.io.IOException;

/**
 * Main class
 * Entry point
 */
public final class Main {

    /**
     * Default constructor
     */
    private Main(){

    }

    /**
     * main method
     * @param args incoming arguments
     * @throws IOException
     */
    public static void main(final String[]args) throws IOException {

        InputFileReader readerOfFile = new InputFileReader();
        ConsoleReader readerOfConsole = new ConsoleReader();

        WriterToFile writerToFile = new WriterToFile();

        CodeFormatter codeFormatter = new CodeFormatter();

        try {
            writerToFile.writeCode("Ввод из файла: \n" + codeFormatter.formatCode(readerOfFile.readCode()));
//            writerToFile.writeCode("Ввод из консоли: \n" + codeFormatter.formatCode(readerOfConsole.readCode()));
        } catch (MissingBracketException missingBracket) {
            missingBracket.printStackTrace();
        }

    }
}
