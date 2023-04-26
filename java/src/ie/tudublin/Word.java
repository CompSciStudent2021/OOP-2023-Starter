package ie.tudublin;

import java.util.ArrayList;

public class Word {

    private String word;
		ArrayList<Follow> follows = new ArrayList<Follow>();
        public Word(String word, ArrayList<Follow> follows) {
            this.word = word;
            this.follows = follows;
        }
        public String getWord() {
            return word;
        }
        public void setWord(String word) {
            this.word = word;
        }
        public ArrayList<Follow> getFollows() {
            return follows;
        }
        public void setFollows(ArrayList<Follow> follows) {
            this.follows = follows;
        }

        public String toString() {
            return "word [word=" + word + ", follows=" + follows + "]";
        }

        public void findFollow(String str) {
            DANI dani = new DANI();
            String[] sonnet = dani.writeSonnet();
            System.out.println(sonnet);
        }
		
}