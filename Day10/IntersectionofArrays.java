package Day10;

public class IntersectionofArrays {
    public static int Intersection(int a[], int b[]) {

        int count = 0;

        for(int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if (a[i] == b[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {89,24,75,11,23};
        int b[] = {89,2,4};

        System.out.println(Intersection(a,b));
    }
}
