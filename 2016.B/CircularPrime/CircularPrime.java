package ISC;

import java.util.Scanner;

public class CircularPrime {
    static boolean isPrime(int n) {
        if(n == 1) return false;
        
        int factors = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) factors++;
        }
        
        return factors <= 2;
    }
    
    static int rotate(int num) {

        int length = String.valueOf(num).length();
        int remainder = num % 10;
        int n = num / 10;
        int result = (int) (remainder * Math.pow(10, length - 1) + n);
        
        return result;
    }
    
    static boolean isCircularPrimeNumber(int n) {
        int length = String.valueOf(n).length();
        
        for(int i = 0; i < length; i++) {
            int r = rotate(n);
            if(!isPrime(r)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = sc.nextInt();
        
        boolean result = isCircularPrimeNumber(n);
        
        System.out.println("Circular Prime Number: "+result);

    }
}
