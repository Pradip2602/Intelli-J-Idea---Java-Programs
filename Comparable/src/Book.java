/*
        ** This is an Example of Comparable Interface
        * Here we use compareTo(Object o) method of comparable interface.
        * This interface belongs to java.lang Package.
 */


public class Book  {
    int id;
    String name;
    String author;

    public Book(int id ,String name , String author  ){
        this.id = id;
        this.name = name;
        this.author = author;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
//
//    @Override
//    public int compareTo(Book o) {
//        return this.id - o.id;
//    }
}
