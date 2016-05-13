package it.pupok.task6.codeFormatter;

import it.pupok.task6.exceptions.missingBracketException.MissingBracketException;

import java.util.ArrayList;

/**
 * Interface for to describe signature the method of formatCode class EntityTheArray
 */
public interface ICodeFormatter {

    /**
     * formatCode
     * @param inputCode incoming array of symbols
     * @return String
     * @throws MissingBracketException
     */
    String formatCode(ArrayList<Character> inputCode) throws MissingBracketException;
}
