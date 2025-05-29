package OneMonthPreparationKit.Basics.Week2Problems;

public class SumvsXOR {

    public static long sumXor(long n) {
        long count = 0;
        if( n == 0)
            return 1;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n >>= 1;
        }
        return 1L << count;

    }
}
