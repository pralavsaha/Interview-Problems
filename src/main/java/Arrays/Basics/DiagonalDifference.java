package Arrays.Basics;
import java.util.*;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int first_diagonal = 0;
        int second_diagonal = arr.size()-1;
        int first_sum = 0;
        int second_sum = 0;
        for(int i=0;i<arr.size();i++) {
            first_sum += arr.get(i).get(first_diagonal);
            second_sum += arr.get(i).get(second_diagonal);

            first_diagonal++;
            second_diagonal--;

        }

        return Math.abs(first_sum-second_sum);

    }
}
