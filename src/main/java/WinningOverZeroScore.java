/*
 * Created by levelarde on 14-02-16.
 */
public class WinningOverZeroScore extends Score{
    public WinningOverZeroScore(Player player1, Player player2){
        super(player1, player2);
    }

    public boolean works(){
        return player1.isWinningOverZeroTo(player2) || player2.isWinningOverZeroTo(player1);
    }

    public String getScore() {
        return getResult(player1.getScore()) + "-" + getResult(player2.getScore());
    }
}
