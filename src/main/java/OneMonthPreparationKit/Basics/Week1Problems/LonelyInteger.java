package OneMonthPreparationKit.Basics.Week1Problems;

public class LonelyInteger {

    public static int lonelyInteger(int[] arr) {

        int res =0;

        for(int i: arr) {
            res ^= i;
        }

        return res;

    }
}
