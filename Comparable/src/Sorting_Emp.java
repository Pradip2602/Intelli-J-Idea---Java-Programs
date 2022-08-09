import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Emp {
    public static void main(String[] args) {
        ArrayList <Emp> emps = new ArrayList<>();
        emps.add(new Emp("Pradip",101));
        emps.add(new Emp("Pratik",102));
        emps.add(new Emp("Aniket",103));
        emps.add(new Emp("Rohan",104));

      // sorting on the basis of ID :
        System.out.println("****Using Comparable Interface****");
        System.out.println(emps);
        Collections.sort(emps,new IdComparator());
        System.out.println(emps);
        System.out.println();
      // sorting on the basis of name :
        System.out.println("****Using Comparator Interface****");
        ArrayList <Emp> emps1 = new ArrayList<>(emps);
        System.out.println(emps1);
        Collections.sort(emps1, new NameComparator());
        System.out.println(emps1);

    }
}
