
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    private Player player1;
    private Player player2;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public String getScore(){
        String score = "";
        TiedScore tieScore = new TiedScore(player1, player2);
        RegularScore regularScore = new RegularScore(player1, player2);
        AdvantageScore advantageScore = new AdvantageScore(player1, player2);

        if(tieScore.works()){
            score = tieScore.getScore();
        }
        else if(regularScore.works()){
            score = regularScore.getScore();
        }
        else if(advantageScore.works()) {
            score = advantageScore.getScore();
        }

        score = getWonScore(score);
        return score;
    }

    private String getWonScore(String score){
        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for " + player1Name;
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for " + player2Name;
        }
        return score;
    }

    private String getAdvantageResult(String score){
        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage " + player1Name;
        }

        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage " + player2Name;
        }
        return score;
    }

    private String getRegularScore(String score){
        if (P1point > P2point && P1point < 4)
        {
            if (P1point == 2)
                P1res = "Thirty";
            if (P1point == 3)
                P1res = "Forty";
            if (P2point == 1)
                P2res = "Fifteen";
            if (P2point == 2)
                P2res = "Thirty";
            score = P1res + "-" + P2res;
        }
        // SECOND PART
        if (P2point > P1point && P2point < 4)
        {
            if (P2point == 2)
                P2res = "Thirty";
            if (P2point == 3)
                P2res = "Forty";
            if (P1point == 1)
                P1res = "Fifteen";
            if (P1point == 2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    private String getWinningOverZeroResult(String score){
        if (P1point > 0 && P2point==0)
        {
            if (P1point==1)
                P1res = "Fifteen";
            if (P1point==2)
                P1res = "Thirty";
            if (P1point==3)
                P1res = "Forty";

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        // SECOND PART
        if (P2point > 0 && P1point==0)
        {
            if (P2point==1)
                P2res = "Fifteen";
            if (P2point==2)
                P2res = "Thirty";
            if (P2point==3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        return score;
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
        P1point++;
    }
    
    public void P2Score(){
        player2.addScore();
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == player1.getName())
            P1Score();
        else
            P2Score();
    }
}