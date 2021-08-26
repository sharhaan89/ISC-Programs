package ISC;

public class TheString {
    
    String str;
    int len, wordCount, cons;
    
    TheString() {
        str = "";
        wordCount = 1;
        len = cons = 0;
    }
    
    TheString(String ds) {
        str = ds;
        len = ds.length();
        wordCount = 1;
        cons = 0;
    }
    
    void countFreq() {
        String vowels = "aeiouAEIOU";
        
        if(str == null) {
            wordCount = 0;
            return;
        }
        
        if(!vowels.contains(String.valueOf(str.charAt(0))))
            cons++;
        
        for(int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            
            if(c1 == ' ' && Character.isLetterOrDigit(c2)) 
                wordCount++;
            if(!vowels.contains(String.valueOf(c2)) && Character.isLetter(c2))
                cons++;
        }  
    }
    
    void Display() {
        System.out.println("Original string: "+str);
        System.out.println("Number of Words: "+wordCount);
        System.out.println("Number of Consonants: "+cons);
    }
    
    public static void main(String args[]) {
        TheString ts = new TheString("Hello World! Programming in Java");
        ts.countFreq();
        ts.Display();
    }
}
