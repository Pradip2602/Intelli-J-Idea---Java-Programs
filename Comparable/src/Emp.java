/*
        ** This is an Example of Comparator Interface.
        * Here we use compare(object o1, object o2) method.
        * This interface belongs to java.util Package
 */

public class Emp  {
    private String name;
    private int id;



    public Emp(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
