package by.tsishkevich.lesson3;

import java.util.Scanner;

public class ThirdLessonClasswork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//
//        int myParam = scanner.nextInt(); // nextLine();
//        if (myParam > 3) {
//            System.out.println("Here");
//        }

//        System.out.println("Enter the username: ");
//        String username = scanner.next();
//        if (myParam > 5) {
//            System.out.println("my param is greater than 5!");
////            if (myParam > 100) {
////                System.out.println("it is too much");
////            }
//        } else if (myParam > 3) {
//            System.out.println("my param is greater than 3!");
//        } else {
//            System.out.println("my param is not greater than 3!");
//        }

//        int temperature = scanner.nextInt();
//        if (temperature >= 20) {
//            System.out.println("hot");
//        } else if (temperature >= 5) {
//            System.out.println("warm");
//        } else if (temperature > -100) {
//            System.out.println("cool");
//        }
//
//        String result = (temperature >= 20) ? "hot"
//                : (temperature >= 5) ? "warm" : "cool";
//
//        System.out.println(result);

        System.out.println("enter the month number: ");
        int month = scanner.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("this is winter");
                break;
            case 3: case 4: case 5: System.out.println("this is spring");
                break;
            case 6: case 7: case 8: System.out.println("this is summer");
                break;
            case 9: case 10: case 11: System.out.println("this is autumn");
                break;
            default:
                System.out.println("this is not a month number");
        }

        //int temperature: 20 - hot, 5 - 20 - warn
        //-100 5 - cool
    }
}
