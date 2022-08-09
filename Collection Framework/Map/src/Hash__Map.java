import java.util.HashMap;

public class Hash__Map {

    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();

        students.put(101,"Rahul");
        students.put(102,"Amit");
        students.put(103,null);
        students.put(104,"Pratik");
        students.put(105,"Suraj");

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }
}
