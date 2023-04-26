package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile("small.txt");
		printModel();
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile(String filename) {
		String[] lines = loadStrings(filename);
		ArrayList<String> wordsList = new ArrayList<String>();
	
		for (String line : lines) {
			String[] words = line.replaceAll("[^\\w\\s]","").toLowerCase().split(" ");
			for (String word : words) {
				wordsList.add(word);
			}
		}
	
		sonnet = wordsList.toArray(new String[0]);
	}

	public void printModel() {
		for (String word : sonnet) {
			println(word);
		}
	}
}