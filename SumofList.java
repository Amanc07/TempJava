import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Source {
    public static List<Integer> getSumOfListElements(List<Integer> first, List<Integer> second) {
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            if (first.get(i) == null) {
                first.add(i, 0);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (second.get(i) == null) {
                second.add(i, 0);
            }
        }
        for (int i = 0, j = 0; i < 5; i++, j++) {
            if (j < 3) {
                temp.add(i, first.get(i) + second.get(j));
            } else {
                temp.add(i, first.get(i));
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        int input;
        for (int i = 0, j = 0; i < 5 || j < 3; i++) {
            input = in.nextInt();
            if (i < 5) {
                a.add(i, input);
            } else {
                b.add(j, input);
                j++;
            }
        }
        List<Integer> res = getSumOfListElements(a, b);
        System.out.println(res);
    }
}
