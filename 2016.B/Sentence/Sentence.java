package ISC;

import java.util.Scanner;

public class Sentence { 
    
    static boolean startEndVowel(String s) {
        String vowels = "AEIOU";
        return (vowels.contains(String.valueOf(s.charAt(0)))) && (vowels.contains(String.valueOf(s.charAt(s.length() - 1))));
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        
        String words[] = s.split(" ");
        int len = words.length;
        String output[] = new String[len];
        int m = 0, n = len - 1;
        
        for(int i = 0, j = len - 1; i < len; i++, j--) {
            if(startEndVowel(words[i])) {
                output[m++] = words[i];
            }
            if(!startEndVowel(words[j])) {
                output[n--] = words[j];
            }
        }
        
        String res = "";
        for(int i = 0; i < len; i++) {
            res += output[i] + " ";
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL="+m);
        System.out.println(res);
    }
}
