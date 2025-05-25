package Arrays.Basics;

public class PlusMinus {

    public static void plusMinus(int[] arr) {
        double positive_count = 0;
        double negative_count = 0;
        double zero_count = 0;
        double array_size = arr.length;

        for(int i : arr) {
            if(i < 0)
                negative_count++;
            else if(i == 0)
                zero_count++;
            else
                positive_count++;
        }

        System.out.println(String.format("%.6f",positive_count/array_size));
        System.out.println(String.format("%.6f",negative_count/array_size));
        System.out.println(String.format("%.6f",zero_count/array_size));
    }

}
