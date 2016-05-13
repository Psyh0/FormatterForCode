package it.pupok.task6.readersOfCode.inputFileReader;

import it.pupok.task6.readersOfCode.iCodeReader.ICodeReader;
import it.pupok.task6.exceptions.readerException.ReaderException;

import java.io.*;
import java.util.ArrayList;

/**
 * class InputFileReader
 * implements ICodeReader
 */
public class InputFileReader implements ICodeReader {

    private static ArrayList<Character> arrayOfInputCode = new ArrayList<Character>();

    /**
     * readCode
     * @return ArrayList<Character>
     * @throws ReaderException
     */
    public ArrayList<Character> readCode() throws ReaderException {
        try {
            InputStream inputStream = new FileInputStream(new File("src//main//resources//inputCode.txt"));
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int c;
            while ((c = bufferedReader.read()) != -1) {
                arrayOfInputCode.add((char) c);
            }
            bufferedReader.close();
            return arrayOfInputCode;
        } catch (IOException e) {
            throw new ReaderException(e);
        }
    }
}