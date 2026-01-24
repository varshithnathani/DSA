import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                list.remove(list.size() - 1);
            } 
            else if (op.equals("D")) {
                int last = list.get(list.size() - 1);
                list.add(2 * last);
            } 
            else if (op.equals("+")) {
                int last = list.get(list.size() - 1);
                int secondLast = list.get(list.size() - 2);
                list.add(last + secondLast);
            } 
            else {
                // it's a number
                list.add(Integer.parseInt(op));
            }
        }

        int result = 0;
        for (int x : list) {
            result += x;
        }

        return result;
    }
}


