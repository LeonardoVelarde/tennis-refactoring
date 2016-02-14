/*
 * Created by levelarde on 14-02-16.
 */
public class AdvantageScore extends Score {
    private Player advantagePlayer;
    public AdvantageScore(Player player1, Player player2){
        super(player1, player2);
        this.advantagePlayer = player1.hasAdvantageOver(player2) ? player1 : player2;
    }

    public boolean works(){
        return player1.hasAdvantageOver(player2) || player2.hasAdvantageOver(player1);
    }

    public String getScore(){
        return "Advantage " + advantagePlayer.getName();
    }
}
