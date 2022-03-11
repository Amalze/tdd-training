package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzEngine {
    public List getFizzBuzzList(int n) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        ListFactory listFactory = new ListFactory();
        List listFizzBuzz = new ArrayList();
        for( Object e : listFactory.getList(n)){
            listFizzBuzz.add(fizzBuzzConverter.convert((Integer) e));
        }
        return listFizzBuzz;
    }
}
