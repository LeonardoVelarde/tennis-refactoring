/*
 * Created by levelarde on 14-02-16.
 */
public abstract class Score {
    protected Player player1;
    protected Player player2;

    public Score(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public abstract String getScore();

    protected String getResult(int score) {
        if(score == 0){
            return "Love";
        }
        else if(score == 1){
            return "Fifteen";
        }
        else if(score == 2){
            return "Thirty";
        }
        else{
            return "Forty";
        }
    }
}
