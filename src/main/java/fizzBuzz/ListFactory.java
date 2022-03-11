package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class ListFactory {

    public List getList(int n) {
        List list = new ArrayList();
       for(int i = 1; i<= n; i++){
           list.add(i);
       }
       return list;
    }
}
