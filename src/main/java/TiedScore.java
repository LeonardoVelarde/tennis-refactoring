/*
 * Created by levelarde on 14-02-16.
 */
public class TiedScore extends Score{
    public TiedScore(Player player1, Player player2){
        super(player1, player2);
    }

    public Boolean works() {
        return player1.hasTieWith(player2);
    }

    public String getScore() {
        return player1.getScore() > 2 ? "Deuce" : getResult(player1.getScore()) + "-All";
    }

}
