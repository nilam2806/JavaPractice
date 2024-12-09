package conditionalstatement;

import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Domain name: ");
        String domain = scan.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".") + 1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;

            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
        }


    }


    //Display day name
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter day number: ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day number");
//                break;
//        }
//    }
}
