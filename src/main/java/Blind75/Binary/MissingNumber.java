package Blind75.Binary;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int xor = 0;

        for(int i=0;i<nums.length;i++) {
            xor = xor ^ i ^ nums[i];
        }
        xor = xor ^ nums.length;
        return xor;
    }
}
