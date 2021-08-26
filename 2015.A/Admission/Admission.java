package ISC;

import java.util.Scanner;

public class Admission {
    
    static int Adno[];
    static Scanner sc;
    
    Admission() {
        Adno = new int[100];
        sc = new Scanner(System.in);
    }
    
    void fillArray() {
        
        System.out.println("Enter the admission numbers of the 100 students (ascending order): ");
        for(int i = 0; i < 100; i++) {
            Adno[i] = sc.nextInt();
        }
    }
    
    int binSearch(int l, int u, int v) {
        
        int mid = (l + u) / 2;
        
        if(u < l) {
            return -1;
        }
        
        if(v == Adno[mid]) 
            return 1;
        else if(v < Adno[mid])
            return binSearch(l, mid - 1, v);
        else
            return binSearch(mid + 1, u, v);
    }
    
    public static void main(String args[]) {
        Admission adm = new Admission();
        adm.fillArray();
        System.out.println("Enter the admission number you want to search: ");
        int v = sc.nextInt();
        System.out.println("Result: "+adm.binSearch(0, 99, v));
    }
}
