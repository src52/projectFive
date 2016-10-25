package projectfive;

/**
 * Created by Spencer on 10/24/2016.
 */
public class Element {
    private String name;
    private int score;
    /**
     *
     */
    public Element(){
        name = "";
        score = 0;
    }
    /**
     *
     * @param n
     * @param s
     */
    public Element(String n, int s){
        name = n;
        score = s;
    }
    public void setName(String n){
        name = n;
    }
    public void setScore(int s){
        score = s;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String toString(){
        return " " + getName() + " " + getScore() + " ";
    }
}