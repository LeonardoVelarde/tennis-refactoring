/**
 * Created by levelarde on 14-02-16.
 */
public class WonScore extends Score {
    private Player playerWhoWonned;
    public WonScore(Player player1, Player player2){
        super(player1, player2);
        this.playerWhoWonned = player1.hasWonOver(player2) ? player1 : player2;
    }

    public boolean works(){
        return player1.hasWonOver(player2) || player2.hasWonOver(player1);
    }

    public String getScore(){
        return  "Win for " + playerWhoWonned.getName();
    }
}
