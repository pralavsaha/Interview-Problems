package OneMonthPreparationKit.Basics.Week2Problems;
import java.util.*;
public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
        for(int i=0;i<grid.size();i++) {
            char[] ch = grid.get(i).toCharArray();
            Arrays.sort(ch);
            grid.set(i,new String(ch));
        }

        for(int col =0;col<grid.get(0).length();col++) {
            for(int row =1;row<grid.size();row++) {
                if(grid.get(row).charAt(col) < grid.get(row-1).charAt(col))
                    return "NO";
            }
        }
        return "YES";
    }
}
