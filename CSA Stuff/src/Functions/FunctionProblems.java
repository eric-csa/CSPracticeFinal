package Functions;

import java.sql.Array;
import java.util.ArrayList;

public class FunctionProblems {
    ArrayList<Integer> a = new ArrayList<>();

    int getNextNumber () {
        if (a.size() == 0) {
            return 5000;
        }
        int res = a.getLast();
        a.removeLast();
        return res;
    }

}
