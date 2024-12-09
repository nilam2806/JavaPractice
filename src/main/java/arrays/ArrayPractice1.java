package arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        int A[] = new int[5];

        int B[] = {1, 2, 3, 4, 5};
        System.out.println(B.length);
//      int C[];
//      C=new int[10];

        B[2] = 6;

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

//        for (int i = 0; i < B.length; i++) {
//            System.out.println(B[i]++);
//        }

//        for (int x : B) {
//            System.out.println(x);
//        }

    }
}
