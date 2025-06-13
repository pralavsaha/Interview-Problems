package Blind75.Binary;

public class NumberOfOneBits {

    public static int oneBits(int n) {
        int count = 0;
        while(n!=0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

}
