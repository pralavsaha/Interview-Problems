package Blind75.DynamicProgramming;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {

        if(amount < 1)
            return 0;

        int[] minDpArray = new int[amount+1];

        for(int i=1;i<=amount;i++) {
            minDpArray[i] = Integer.MAX_VALUE;

            for(int coin : coins) {
                if(coin <= i && minDpArray[i-coin] != Integer.MAX_VALUE) {
                    minDpArray[i] = Math.min(minDpArray[i], 1+minDpArray[i-coin]);
                }
            }
        }

        if(minDpArray[amount] == Integer.MAX_VALUE)
            return -1;
        return minDpArray[amount];
    }
}
