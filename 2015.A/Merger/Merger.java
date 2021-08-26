package ISC;

import java.util.Scanner;

public class Merger {
    
    long n1, n2, mergNum;
    
    Merger() {
        n1 = n2 = mergNum = 0;
    }
    
    void readNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n1 and n2");
        n1 = sc.nextLong();
        n2 = sc.nextLong();
    }

    void JoinNum() {
        String n11 = String.valueOf(n1);
        String n22 = String.valueOf(n2);
        String res = n11.concat(n22);
        mergNum = Long.parseLong(res);
    }
    
    void show() {
        System.out.println("Number 1: "+n1);
        System.out.println("Number 2: "+n2);
        System.out.println("Merged number: "+mergNum);
    }
    
    public static void main(String args[]) {
        Merger merger = new Merger();
        merger.readNum();
        merger.JoinNum();
        merger.show();
    }
}
