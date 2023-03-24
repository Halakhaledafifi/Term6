
import java.util.ArrayList;
public class Q3 {

    public static void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {

            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {

                    int t = list.get(i);
                    list.set (i,list.get(j));
                    list.set (j,t);
                }
            }
        }
    }
}
