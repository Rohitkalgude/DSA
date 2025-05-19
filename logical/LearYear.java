package logical;

public class LearYear {
    public static void main(String[] args) {
        int year = 2022;


        if ((year % 4 == 0 || year % 100 != 0) || (year % 400 == 0)){
            System.out.println("yes leep year " +year);
        }
        else {
            System.out.println("not leep year " +year);
        }
    }
}
