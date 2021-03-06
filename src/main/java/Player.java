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

    public boolean hasTieWith(Player opponent){
        return score == opponent.getScore();
    }

    public boolean hasAdvantageOver(Player opponent){
        return score >= 4 && score - opponent.getScore() == 1;
    }

    public boolean hasWonOver(Player opponent){
        return score>=4 && opponent.getScore()>=0 && (score-opponent.getScore())>=2;
    }

    public void addScore(){
        score++;
    }


}
