package ISC;

import java.util.Scanner;

public class Account extends Bank {
    
    double amt;
    Scanner sc = new Scanner(System.in);
    
    public Account(String n, long no, double pp) {
        super(n, no, pp);
    }
    
    void deposit() {
        amt = sc.nextDouble();
        super.p += amt;
    }
    
    void withdraw() {
        amt = sc.nextDouble();
        
        if(amt > super.p) {
            System.out.println("INSUFFICIENT BALANCE");
            return;
        }
        
        super.p -= amt;
        if(super.p < 500) {
            super.p = p - (500 - p) / 10;
        }
    }
    
    @Override
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Account number: "+accno);
        System.out.println("Principal Amount: "+p);
    }
}
