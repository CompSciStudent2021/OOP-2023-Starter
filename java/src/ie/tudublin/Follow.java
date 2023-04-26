package ie.tudublin;

public class Follow {
    String word;
    int count;

    public Follow(String word) {
        this.word = word;
        count = 1;
    }

    public void render() {
        System.out.println(word + "\t" + count);
    }

    public String toString() {
        return word + "\t" + count;
    }

    public boolean equals(Object obj) {
        Follow f = (Follow) obj;
        return word.equals(f.getWord());
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}

