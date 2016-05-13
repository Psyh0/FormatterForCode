package it.pupok.task6.codeFormatter;

import it.pupok.task6.iCodeFormatter.ICodeFormatter;
import it.pupok.task6.exceptions.missingBracketException.MissingBracketException;

import java.util.ArrayList;

/**
 * class CodeFormatter
 * implements interface ICodeFormatter
 * formats incoming code
 */
public class CodeFormatter implements ICodeFormatter {

    /**
     * formats incoming code
     * @param inputCode incoming array of symbols
     * @return String
     * @throws MissingBracketException
     */
    public String formatCode(final ArrayList<Character> inputCode) throws MissingBracketException {
        int differentInBrackets = 0;
        String outputCode = "";
        String stringIndented = "";
        String tabulation = "    ";
        for (char currentChar : inputCode) {
            String interimString = "" + currentChar;
            switch (currentChar) {
                case '{':
                    differentInBrackets++;
                    stringIndented = stringIndented.concat(tabulation);
                    interimString = currentChar + "\n" .concat(stringIndented);
                    break;
                case '}':
                    differentInBrackets--;
                    outputCode = outputCode.substring(0, outputCode.length() - 4);
                    stringIndented = stringIndented.substring(4);
                    interimString = currentChar + "\n".concat(stringIndented);
                    break;
                case ';':
                    interimString = interimString.concat("\n" + stringIndented);
                    break;
                case '(':
                    interimString = " " + currentChar;
                    break;
                case ')':
                    interimString = currentChar + " ";
                    break;
                case '&':
                    interimString = " " + currentChar + " ";
                    break;
                case '|':
                    interimString = " " + currentChar + " ";
                    break;
                case '+':
                    interimString = " " + currentChar + " ";
                    break;
                case '-':
                    interimString = " " + currentChar + " ";
                    break;
            }
            outputCode = outputCode.concat(interimString);
        }
        if (differentInBrackets != 0) {
            throw new MissingBracketException();
        }
        return outputCode;
    }
}
