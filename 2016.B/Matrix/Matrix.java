package ISC;

import java.util.Scanner;

public class Matrix {
    
    static Scanner sc = new Scanner(System.in);
    static int arr[][];
    static int m;
    
    static void sort() {
        int len = (m - 2) * (m - 2);
        int a[] = new int[len], index = 0;
        
        for(int i = 1; i < m - 1; i++) {
            for(int j = 1; j < m - 1; j++) {
                a[index] = arr[i][j];
                index++;
            }
        }
        
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        index = 0;
        for(int i = 1; i < m - 1; i++) {
            for(int j = 1; j < m - 1; j++) {
                arr[i][j] = a[index];
                index++;
            }
        }
    } 

    static void display() {
        System.out.println("ORIGINAL MATRIX");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        sort();
        System.out.println("REARRANGED MATRIX");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int sumOfDiagonalE = 0;
        System.out.println("DIAGONAL ELEMENTS");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if(i == j || i + j == m - 1) {
                    System.out.print(arr[i][j]+" ");
                    sumOfDiagonalE += arr[i][j];
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS="+sumOfDiagonalE);
    } 
   
    public static void main(String args[]) {
        
        System.out.println("Enter the size of the matrix: ");
        m = sc.nextInt();
        
        if(m < 3 || m > 10) System.exit(0);
        
        arr = new int[m][m];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        display();
    }
}
