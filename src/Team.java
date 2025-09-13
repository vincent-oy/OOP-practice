import java.util.ArrayList;

public class Team {
    private String name;
    // List of matches this team has played
    private ArrayList<Match> matches;
    private int points;
    private int goalsFor;
    private int goalsAgainst;

    public Team(String name) {
        this.name = name;
        this.matches = new ArrayList<>();
        this.points = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
    }

    public String getName() {
        return name;
    }
    //Method to update stats after a match
    public String getRecord() {
        // "Tigers: 12 points, 15 GF, 8 GA".
        return String.format("%s: %d points, %d GF, %d GA", name, points, goalsFor, goalsAgainst);

    public String getRecord() {
        return String.format("%s: %d points, %d GF, %d GA", name, points, goalsFor, goalsAgainst);
    }

    public void updateStats(Match m) {
        matches.add(m);
        points += m.homeScore + m.awayScore;

        int homeScore = m.getHomeScore();
        int awayScore = m.getAwayScore();

        if (this == m.getHomeTeam()) {
            goalsFor += homeScore;
            goalsAgainst += awayScore;
            if (homeScore > awayScore) {
                points += 3;
            } else if (homeScore == awayScore) {
                points += 1;
            }
        } else if (this == m.getAwayTeam()) {
            goalsFor += awayScore;
            goalsAgainst += homeScore;
            if (awayScore > homeScore) {
                points += 3;
            } else if (homeScore == awayScore) {
                points += 1;
            }
        }
    }
}
