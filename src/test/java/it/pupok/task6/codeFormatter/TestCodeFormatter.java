package it.pupok.task6.codeFormatter;

import it.pupok.task6.codeFormatter.codeFormatter.CodeFormatter;
import it.pupok.task6.exceptions.missingBracketException.MissingBracketException;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * Test for the class CodeFormatter
 */
public class TestCodeFormatter {

    /**
     * Test for the method formatCode
     * @throws MissingBracketException
     */
    @Test
    public void testFormatCode() throws MissingBracketException {
        CodeFormatter codeFormatter = new CodeFormatter();

        ArrayList<Character> expectedArray = new ArrayList<Character>();
        String expectedString = "{{;;}{;;}}";

        for(char currentChar : expectedString.toCharArray()) {
            expectedArray.add(currentChar);
        }

        String actualString = "{\n    {\n        ;\n        ;\n    }\n    {\n        ;\n        ;\n    }\n}\n";

        assertEquals(actualString, codeFormatter.formatCode(expectedArray));
    }
}
