package it.pupok.task6.readersOfCode.converterStringToArray;

import it.pupok.task6.readersOfCode.iConverterStringToArray.IConverterStringToArray;

import java.util.ArrayList;

/**
 * class ConverterStringToArray
 * implements interface IConverterStringToArray
 * converts input string to array of characters
 */
public class ConverterStringToArray implements IConverterStringToArray {

    /**
     * converts input string to array of characters
     * @param inputCode incoming parameter
     * @return ArrayList<Character>
     */
    public ArrayList<Character> convertToArray(final String inputCode) {
        ArrayList<Character> arrayOfOutputCode = new ArrayList<Character>();
        for (char currentChar : inputCode.toCharArray()) {
            arrayOfOutputCode.add(currentChar);
        }
        return arrayOfOutputCode;
    }
}
