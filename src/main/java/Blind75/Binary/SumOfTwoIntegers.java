package Blind75.Binary;

public class SumOfTwoIntegers {

    public static int sumOfTwoIntegers(int a , int b) {
        while(b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
