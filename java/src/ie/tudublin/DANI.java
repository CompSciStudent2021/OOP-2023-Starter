package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	public void loadFile() {
		loadStrings("small.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words
		w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		s.toLowerCase() // Convert a string to lower case 
	}

	public void printModel() {
		for (int i = 0; i < Word.size(); i++) {
			Word w = Word.get(i);
			println(w);
		}
	}

	public string findWord() {
		for (int i = 0; i < sonnet.length - 1; i++) {
			String word = sonnet[i];
			String next = sonnet[i + 1];
			if (word.equals(this.word)) {
				Follow f = new Follow(next);
				addFollow(f);
			}
		}
	}

	public void addFollow(Follow f) {
		follows.add(f);
	}

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        String[] sonnet = new String[14];
		int line = 0;
		while(line < 14)
		{
			// Find the word
			current = copy.get(index);
			poem = poem + current.getWord() + " ";
			// Find the next word
			if (current.getFollows().size() == 0) {
				break;
			}
			index = (int) random(current.getFollows().size());
			Follow f = current.getFollows().get(index);
			String next = f.getWord();
			// Remove the word from the list
			copy.remove(current);
		}
		return sonnet;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {
		if (keyCode == ' ') {
			findWord();
			printModel();
			sonnet = writeSonnet();
			println(sonnet);
		}

	}

	public void println(String[] poem) {
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
}
