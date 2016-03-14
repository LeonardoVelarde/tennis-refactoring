
public class TennisGame2 implements TennisGame
{
    private Player player1;
    private Player player2;
    private Score scoreState;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public String getScore(){
        String score = "";
        TiedScore tieScore = new TiedScore(player1, player2);
        RegularScore regularScore = new RegularScore(player1, player2);
        AdvantageScore advantageScore = new AdvantageScore(player1, player2);
        WonScore wonScore = new WonScore(player1, player2);

        if(tieScore.works()){
            this.scoreState = new TiedScore(player1, player2);
        }
        else if(regularScore.works()){
            this.scoreState = new RegularScore(player1, player2);
        }
        else if(advantageScore.works()) {
            this.scoreState = new AdvantageScore(player1, player2);
        }
        else if(wonScore.works()){
            this.scoreState = new WonScore(player1, player2);
        }

        return this.scoreState.getScore();
    }

    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1.addScore();
    }
    
    public void P2Score(){
        player2.addScore();
    }

    public void wonPoint(String player) {
        if (player.equals(player1.getName()))
            P1Score();
        else
            P2Score();
    }
}