package fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFactoryTest {

    @Test
    public void shouldReturnListOfIntegerFrom1To3When3IsGiven(){
        ListFactory listFactory = new ListFactory();
        List result = listFactory.getListOfInteger(3);
        Assertions.assertEquals(Arrays.asList(1, 2, 3),result);
    }

    @Test
    public void shouldReturnListOfIntegerFrom1To15When15IsGiven(){
        ListFactory listFactory = new ListFactory();
        List result = listFactory.getListOfInteger(15);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15),result);
    }
}
