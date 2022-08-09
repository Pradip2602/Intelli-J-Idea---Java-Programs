import java.util.TreeSet;
import java.util.SortedSet;

public class Tree_Set {
    public static void main(String[] args) {
        SortedSet ss = new TreeSet<Integer>();

        ss.add(10);
        ss.add("20");
        ss.add(50);
        ss.add(40);

        System.out.println(ss);
    }
}
