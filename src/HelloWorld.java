public class HelloWorld {

    public static void main(String[] args) {
//        byte firstByteExample = 3;
//        short myShort = firstByteExample;
//        byte secondByte = (byte) myShort;
//        char letter = 'a';
//        int myLetter = 30;
//        int c = 3;
//        int b = 5;
//        float myFloatNumber = 2.5f;
//        double myDoubleNumber = 3.5;
//
//        boolean isTrue = true;
//        boolean isFalse = false;
//
//        System.out.println(isTrue);
//        System.out.println(myLetter);
//
//        // +, -, *, /
//        int aa = 5;
//        int bb = 3;
//        System.out.println((double)aa/bb);
//        System.out.println((double)(aa/bb));
//        System.out.println(aa%bb);
//
//        //aa = 5;
//        aa = aa + 1;
//        aa++;
//        aa--;
//
//        ++aa;
//        --aa;
//        int t = 7;
//        System.out.println(t++);
//        System.out.println(t);
//        System.out.println(++t);


        //sout - not to write by hands
        System.out.println("Hello world 2!!");
        int minValue = 3;
        int maxValue = 5;
        System.out.println(minValue == maxValue);
        System.out.println(minValue != maxValue);

        System.out.println(minValue < maxValue);
        System.out.println(minValue > maxValue);
        System.out.println(minValue <= maxValue);
        System.out.println(minValue >= maxValue);
        boolean isEqual = minValue == maxValue;
        System.out.println(minValue++ < 0 && maxValue-- > 10);
        System.out.println(minValue > 0 || maxValue++ > 10);
        System.out.println(!(minValue > 0));

        System.out.println(minValue < 0 & maxValue-- > 10);
        System.out.println(minValue > 0 | maxValue++ > 10);

        minValue += 3;
        minValue -= 3;
        minValue *= 3;
        minValue /= 3;
        minValue %= 3;
    }
}
