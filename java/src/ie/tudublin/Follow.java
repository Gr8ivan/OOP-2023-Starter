package ie.tudublin;

public class Follow extends DANI{
    private String word;
    private int count;
    
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public String toString() {
        return "Word: " + this.word + ", Count: " + this.count;
    }
}

