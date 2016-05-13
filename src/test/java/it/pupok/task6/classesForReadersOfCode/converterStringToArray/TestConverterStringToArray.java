package it.pupok.task6.classesForReadersOfCode.converterStringToArray;

import it.pupok.task6.readersOfCode.converterStringToArray.ConverterStringToArray;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Pupok on 22.04.2016.
 */
public class TestConverterStringToArray {

    @Test
    public void testConvertToArray(){
        ConverterStringToArray converterStringToArray = new ConverterStringToArray();
        ArrayList<Character> actualArray = new ArrayList<Character>();
        String expectedArray = "abc";

        actualArray.add('a');
        actualArray.add('b');
        actualArray.add('c');

        assertEquals(actualArray, converterStringToArray.convertToArray(expectedArray));
    }
}
