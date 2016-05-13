package it.pupok.task6.reader.console;

import it.pupok.task6.readersOfCode.converterStringToArray.ConverterStringToArray;
import it.pupok.task6.reader.ICodeReader;
import it.pupok.task6.exceptions.readerException.ReaderException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * class ConsoleReader
 * implements ICodeReader
 * reads code from the console
 */
public class ConsoleReader implements ICodeReader {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList<Character> arrayOfInputCode = new ArrayList<Character>();
    private static ConverterStringToArray converterStringToArray = new ConverterStringToArray();

    /**
     * enters code from console into array
     * @return ArrayList<Character>
     * @throws ReaderException
     */
    public ArrayList<Character> readCode() throws ReaderException {
        try {
            String inputCode = bufferedReader.readLine();
            arrayOfInputCode.addAll(converterStringToArray.convertToArray(inputCode));
            return arrayOfInputCode;
        } catch (IOException e) {
            throw new ReaderException(e);
        }
    }
}