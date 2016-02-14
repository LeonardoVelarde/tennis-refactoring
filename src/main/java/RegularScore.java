/*
 * Created by levelarde on 14-02-16.
 */
public class RegularScore extends Score {
    public RegularScore(Player player1, Player player2){
        super(player1, player2);
    }

    public boolean works(){
        return player1.getScore() < 4 && player2.getScore() < 4;
    }

    public String getScore() {
        return getResult(player1.getScore()) + "-" + getResult(player2.getScore());
    }
}
