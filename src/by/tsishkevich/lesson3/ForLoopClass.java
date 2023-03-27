package by.tsishkevich.lesson3;

public class ForLoopClass {
    public static void main(String[] args) {
        for (int counter = 0; counter < 100; counter++) {
            System.out.println("aaaaa" + counter);
        }

//        for (int x = 0; x < 100; x++) {
//            if (x % 2 != 0) {
//                System.out.println(x);
//            }
//        }
//
//        for (int x = 1; x < 1000; x += 2) {
//            System.out.println(x);
//        }
//
//        for (int x = 0; x < 50; x++) {
//            System.out.println(2 * x);
       // }
        int count = 100;
        while(count>0) {
            count-=2;
            if (count%10 == 0) {
               return;
            }
            System.out.println("count: " + count);

        }
        System.out.println("this is the end");
//
//        do {
//            System.out.println("count again: " + count);
//            count+=2;
//        } while (count<100);

    }
}

