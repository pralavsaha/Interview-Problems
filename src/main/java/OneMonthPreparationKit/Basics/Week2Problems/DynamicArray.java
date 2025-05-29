package OneMonthPreparationKit.Basics.Week2Problems;
import java.util.*;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int lastAsnwer = 0;

        for(int i=0;i<n;i++)
            seqList.add(new ArrayList<>());

        for(List<Integer> query : queries ) {
            int type = query.get(0);
            int x  = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAsnwer) %n;
            List<Integer> seq = seqList.get(idx);

            if(type == 1) {
                seq.add(y);}
            else {
                lastAsnwer = seq.get(y% seq.size());
                res.add(lastAsnwer);
            }
        }

        return res;
    }
}
