package fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzEngineTest {

    @Test
    public void shouldReturn12FizzWhen3IsGiven(){
        FizzBuzzEngine fizzBuzzEngine = new FizzBuzzEngine();
        List result = fizzBuzzEngine.getFizzBuzzList(5);
        assertEquals(Arrays.asList("1", "2","Fizz", "4", "Buzz"),result);
    }
}
