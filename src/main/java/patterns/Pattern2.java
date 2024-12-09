package patterns;

public class Pattern2 {

    /*public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }*/

    /*public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }*/

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}
