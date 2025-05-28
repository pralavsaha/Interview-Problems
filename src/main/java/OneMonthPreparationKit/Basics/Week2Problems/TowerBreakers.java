package OneMonthPreparationKit.Basics.Week2Problems;

public class TowerBreakers {

    public static int towerBreakers(int n, int m) {

        if(m == 1)
            return 2;
        if(n % 2 == 0)
            return 2;
        if(n%2 != 0 && m > 1)
            return 1;
        return 1;
    }
}
