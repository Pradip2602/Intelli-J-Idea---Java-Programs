class Employee{
    int id ;
    String name;

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public Employee(int id , String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Employee id :"+id+" \n"+"Employee name :"+" "+name;
    }
}

public class To_String {
    public static void main(String[] args) {

        Employee emp = new Employee(101,"Pratik");
        System.out.println(emp);
    }
}
