package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class DANI extends PApplet {

	String[] wordsList;

    ArrayList<String> words = new ArrayList<String>();

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
        loadFile();
        for (String word : words) {
            System.out.println(word); // Print each word in the list
        }

    }

	//Tried to use another array to count how many times the words are used but ran out of time
	public int findWord(String s) {
		loadFile();
		int count = 0;
		int[] countArray;
		for (int i = 0; i < wordsList.length; i++) {
			if (s.equals(wordsList[i])) {
				countArray[i]++;
			}
		}

		return countArray;
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


    public void loadFile() {
        String[] lines = loadStrings("small.txt");
        for (String line : lines) {
            String[] words = split(line, ' ');
            for (String word : words) 
            {
                //word = word.replaceAll("[^\w\s]","");
                word = word.toLowerCase();
                this.words.add(word);
            }
        }

    }

	public void printModel() {
		for (int i = 0; i < words.length - 1; i++) {
			System.out.println(wordsList[i]);
		}
	}



}