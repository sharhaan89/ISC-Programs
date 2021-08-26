package ISC;

public class WordPile {
    
    char ch[];
    int capacity;
    int top;
    
    WordPile(int cap) {
        capacity = cap;
        ch = new char[capacity];
        top = -1;
    }
    
    void pushChar(char v) {
        if((top + 1) >= capacity) {
            System.out.println("WordPile is full");
            return;
        }
        
        ch[++top] = v;
    }
    
    char popChar() {
        if(top == -1) 
            return '\\';
        
        char r = ch[top];
        ch[top--] = ' ';
        return r;
    }
    
    public static void main(String args[]) {
        WordPile wordpile = new WordPile(5);
        wordpile.pushChar('a');
        wordpile.pushChar('e');
        wordpile.pushChar('i');
        wordpile.pushChar('o');
        wordpile.pushChar('u');
        System.out.println(wordpile.popChar());
        
    }
}
