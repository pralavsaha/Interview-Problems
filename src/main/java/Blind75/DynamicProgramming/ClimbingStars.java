package Blind75.DynamicProgramming;

public class ClimbingStars {

    public static int climbStairs(int n) {

        if(n<=1)
            return 1;
        int ans =0;
        int last = 1;
        int secondLast = 1;
        for(int i=2;i<=n;i++)
        {
            ans = last + secondLast;
            secondLast = last;
            last = ans;
        }
        return ans;
    }

}
