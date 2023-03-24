import java.util.ArrayList;

public class Q2
{

    public static Integer max(ArrayList<Integer> list) {
        if ((list.isEmpty() == true) || (list.size() == 0))
            return null;
        else {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max)
                    max = list.get(i);
            }
            return max;
        }
}}
