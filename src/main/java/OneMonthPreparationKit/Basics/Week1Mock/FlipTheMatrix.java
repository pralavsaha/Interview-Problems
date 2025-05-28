package OneMonthPreparationKit.Basics.Week1Mock;
import java.util.*;

public class FlipTheMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = matrix.get(i).get(j);
                int b = matrix.get(i).get(2 * n - 1 - j);
                int c = matrix.get(2 * n - 1 - i).get(j);
                int d = matrix.get(2 * n - 1 - i).get(2 * n - 1 - j);

                maxSum += Math.max(Math.max(a, b), Math.max(c, d));
            }
        }

        return maxSum;
    }
}
