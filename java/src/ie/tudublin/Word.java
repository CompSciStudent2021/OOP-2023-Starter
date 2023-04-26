package ie.tudublin;

public class Word {

    String word;

    ArayList<Follow> follows = new ArrayList<Follow>();

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

    public Word(String word) {
        this.word = word;
    }

    public void addFollow(Follow f)
    {
        follows.add(f);
    }

    public void render()
    {
        for(Follow f:follows)
        {
            f.render();
        }
    }

    public String toString()
    {
        return word + "\t" + follows;
    }

    public void findFollow() {
        for (int i = 0; i < sonnet.length - 1; i++) {
            String word = sonnet[i];
            String next = sonnet[i + 1];
            if (word.equals(this.word)) {
                Follow f = new Follow(next);
                addFollow(f);
            }
        }
    }
}
