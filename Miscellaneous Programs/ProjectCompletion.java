

import java.util.Scanner;


public class ProjectCompletion {
    
    static int calculateDays(String date1, String date2) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day1 = Integer.parseInt(date1.substring(0, 2));
        int day2 = Integer.parseInt(date2.substring(0, 2));
        int month1 = Integer.parseInt(date1.substring(3, 5));
        int month2 = Integer.parseInt(date2.substring(3, 5));
        int year1 = Integer.parseInt(date1.substring(6));
        int year2 = Integer.parseInt(date2.substring(6));
        
        int res = 0;
        
        if(isLeapYear(year1))
            days[1] = 29;

        res += days[month1 - 1] - day1 + 1;

        while(month1 < 12) {
            res += days[month1++];
        }

        month1 = 1;
        if(!isLeapYear(year2))
            days[1] = 28;
        
        while(month1 < month2) {
            res += days[month1++];
        }
        
        res += day2;
        year1++;

        while(year1++ < year2) {
            if(isLeapYear(year1))
                res += 366;
            else
                res += 365;
        }

        return res;

    }
    
    static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting date (format - DD/MM/YY): ");
        String startingDate = sc.nextLine();
        System.out.println("Enter the ending date (format - DD/MM/YY): ");
        String endingDate = sc.nextLine();
        System.out.println("Number of days for project completion: "+calculateDays(startingDate, endingDate));
    }
}
