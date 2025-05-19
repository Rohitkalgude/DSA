package Basic;

public class largest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

//
//        if (a>=b &&  a>=c){
//            System.out.println("A is largest " +a);
//        } else if (b>=c && b>=a) {
//            System.out.println("B is largest "+b);
//        }else {
//            System.out.println("C is largest "+c);
//        }


        int largest = (a>b)?(a>c ? a:c):(b>c ? b:c);
        System.out.println("largest therrr number "+largest);
    }
}


