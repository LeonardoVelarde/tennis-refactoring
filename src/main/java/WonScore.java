/**
 * Created by levelarde on 14-02-16.
 */
public class WonScore extends Score {
    public WonScore(Player player1, Player player2){
        super(player1, player2);
    }

    public boolean works(){
        return player1.hasWonOver(player2) || player2.hasWonOver(player1);
    }
}
