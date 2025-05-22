package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class exmple2 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(20);
        list.add(80);

        //remove value
//        list.remove(2);
//
//        for (int x : list){
//            System.out.println(x);
//        }



        //change value
        list.set(2, 50);
        System.out.println(list);

    }
}
