package ISC;

public class Disarium {
    
    int num;
    int size;
    
    Disarium(int nn) {
        num = nn;
        size = 0;
    }
    
    void countDigit() {
        int n = num;

        while(n != 0) {
            int d = n % 10;
            n = n/10;
            size++;
        }
    }
    
    int sumOfDigits(int n, int p) {
        if(p == 0) return n;
        return (int) (Math.pow(n % 10, p) + sumOfDigits(n / 10, p - 1));
    }
    
    void check() {
        if(sumOfDigits(num, size) == num) 
            System.out.println(num+" is a Disarium number");
        else 
            System.out.println(num+" is not a Disarium number");
    }
    
    public static void main(String args[]) {
        
        Disarium disarium = new Disarium(135);
        disarium.countDigit();
        disarium.check();
         
    }
}
