import java.util.ArrayList;

public class Team {
    //Attributes
    private String name;
    private ArrayList<Match> matches;
    private int points;
    private int goalsFor;
    private int goalsAgainst;

    //Constructor
    public Team(String name) {
        this.name = name;
        this.matches = new ArrayList<>();   //start with an empty match list
        this.points = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
    }
    //Method to update stats after a match
    public String getRecord() {
        // "Tigers: 12 points, 15 GF, 8 GA".
        return String.format("%s: %d points, %d GF, %d GA", name, points, goalsFor, goalsAgainst);

    }

    public void updateStats(Match m) {
        matches.add(m);
        points += m.homeScore + m.awayScore;

        if (this == m.homeTeam) {
            goalsFor += m.homeScore;
            goalsAgainst += m.awayScore;
        }
        else if (this == m.awayTeam) {
            goalsFor += m.awayScore;
            goalsAgainst += m.homeScore;
        }

    }
}
