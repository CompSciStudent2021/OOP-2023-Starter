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
		for (int i = 0; i < words.size(); i++) {
			Word w = words.get(i);
			println(w);
		}
	}
	
	public string writeSonnet() {
		// make a copy of the arraylist
		ArrayList<Word> copy = new ArrayList<Word>();
		for (Word w : words) {
			Word c = new Word(w);
			copy.add(c);
		}
		// Generate first word
		int index = (int) random(copy.size());
		Word current = copy.get(index);
		String poem = current.getWord() + " ";
		int line = 0;
		while (line < 8) {
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
		return poem;
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
}
