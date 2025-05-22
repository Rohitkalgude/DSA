package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class exmple {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(20); //1
        list.add(80); //2



        System.out.println(list.get(1));

        // all list print
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.size()); //3


        //simple way print
        for (int x: list){
            System.out.println(x);
        }


        //exiting value his check
        System.out.println(list.contains(5));
        System.out.println(list.contains(20));

    }
}
