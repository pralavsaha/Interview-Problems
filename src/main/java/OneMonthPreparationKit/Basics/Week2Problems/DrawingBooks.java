package OneMonthPreparationKit.Basics.Week2Problems;

public class DrawingBooks {

    public static int pageCount(int n, int p) {
        int turnFront = p/2;
        int turnBack = n/2 - turnFront;

        return Math.min(turnBack,turnFront);
    }
}
