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

    public boolean isWinningOverZeroTo(Player opponent){
        return score > 0 && opponent.getScore() == 0;
    }

    public boolean hasRegularScoreWith(Player opponent){
        return score > opponent.getScore() && score < 4;
    }

    public boolean hasAdvantageOver(Player opponent){
        return score > opponent.getScore() && opponent.getScore() >= 3;
    }

    public void addScore(){
        score++;
    }


}
