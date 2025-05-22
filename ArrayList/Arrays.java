package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {

        ArrayList <Integer> List = new ArrayList();

        List.add(3);
        List.add(2);
        List.add(1);

        //remove value
        List.remove(Integer.valueOf(1));
        System.out.println(List);

        //collection
        Collections.sort(List);
        System.out.println(List);
    }
}
