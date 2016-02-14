/*
 * Created by levelarde on 14-02-16.
 */
public class Player {
    private int score;
    private String name;
    private String result;
    public Player(String name){
        this.name = name;
        this.score = 0;
        this.result = "";
    }

    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }

    public boolean hasTieWith(Player oponent){
        return score == oponent.getScore();
    }

    public void addScore(){
        score++;
    }


}
