package fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFactoryTest {

    @Test
    public void shouldReturnListOf1To3When3IsGiven(){
        ListFactory listFactory = new ListFactory();
        List result = listFactory.getList(3);
        Assertions.assertEquals(Arrays.asList(1, 2, 3),result);
    }

}
