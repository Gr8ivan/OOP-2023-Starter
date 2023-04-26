package ie.tudublin;

import java.util.ArrayList;

public class Word extends DANI{
    private String word;
    private ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    public String getWord() {
        return this.word;
    }

    public ArrayList<Follow> getFollows() {
        return this.follows;
    }

    public void addFollow(String word, int count) {
        Follow newFollow = new Follow(word, count);
        this.follows.add(newFollow);
    }

    public Follow findFollow(String word) {
        for (Follow f : this.follows) {
            if (f.getWord().equals(word)) {
                return f;
            }
        }
        return null;
    }

    public String toString() {
        String output = "Word: " + this.word + "\n";
        for (Follow f : this.follows) {
            output += f.toString() + "\n";
        }
        return output;
    }
}