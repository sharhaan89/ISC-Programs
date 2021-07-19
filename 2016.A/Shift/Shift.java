package ISC;

import java.util.Scanner;

public class Shift {
    
    int mat[][];
    int m, n;
    
    Shift(int mm, int nn) {
        m = mm;
        n = nn;
    }
    
    void input() {
        mat = new int[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    
    void cyclic(Shift P) {
        int t[] = mat[0];
        
        for(int i = 0; i < m - 1; i++) {
            mat[i] = mat[i + 1];
        }
        
        mat[m - 1] = t;
    }
    
    void display() {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Shift shift = new Shift(3, 3);
        shift.input();
        shift.cyclic(shift);
        shift.display();
    }
}
