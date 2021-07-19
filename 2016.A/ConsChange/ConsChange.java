package ISC;

import java.util.Scanner;

public class ConsChange {
    
    String word;
    int len;
    
    ConsChange() {
        word = "";
        len = 0;
    }
    
    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word = sc.next().toLowerCase();
        len = word.length();
    }
    
    void shiftcons() {
        String vowelsList = "aeiou";
        String cons, vowels;
        cons = vowels = "";
        
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(vowelsList.contains(String.valueOf(c)))
                vowels += c;
            else 
                cons += c;
        }
        
        word = cons + vowels;
    }
    
    void changeword() {
        String vowelsList = "aeiou";
        String changedWord = "";
        
        for(int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if(!vowelsList.contains(String.valueOf(c))) 
                changedWord += Character.toUpperCase(c);
            else 
                changedWord += c;
        }
        
        word = changedWord;
    }
    
    void show() {
        System.out.println("Original word: "+word);
        shiftcons();
        System.out.println("Shifted word: "+word);
        changeword();
        System.out.println("Changed word: "+word);
    }
    
    public static void main(String args[]) {
        
        ConsChange cc = new ConsChange();
        cc.readword();
        cc.show();
    }
}
