package ISC;

public class Book {
    
    String name[];
    int point;
    int max;
    
    Book(int cap) {
       max = cap;
       name = new String[max];
       point = -1;
    }
    
    void tell() {
        if(name[point] == null) 
            System.out.println("SHELF EMPTY");
        else
            System.out.println(name[point]);
    }
    
    void add(String v) {
        if(point + 1 >= max) {
            System.out.println("SHELF FULL");
        } else {
            name[++point] = v;
        } 
    }
}
