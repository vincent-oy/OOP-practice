public class Match {
    // Worksheet: date of the match
    private String date;

    // Worksheet: home and away teams
    private Team homeTeam;
    private Team awayTeam;

    // Worksheet: scores for each team
    private int homeScore;
    private int awayScore;

    // Worksheet: constructor sets date and participating teams
    public Match(String date, Team homeTeam, Team awayTeam) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    // Worksheet: record the final score
    public void setResult(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    // Worksheet: expose home team
    public Team getHomeTeam() {
        return homeTeam;
    }

    // Worksheet: expose away team
    public Team getAwayTeam() {
        return awayTeam;
    }

    // Worksheet: expose home score
    public int getHomeScore() {
        return homeScore;
    }

    // Worksheet: expose away score
    public int getAwayScore() {
        return awayScore;
    }

    // Worksheet: describe match as a readable string
    @Override
    public String toString() {
        // return homeTeam.getName() + " " + homeScore + " - " + awayScore +
        //        " " + awayTeam.getName() + " (" + date + ")";
        // Example: "Tigers 2 - 1 Eagles (12/09/2025)"
        return String.format("%s %d - %d %s (%s)",
                homeTeam.getName(), homeScore, awayScore, awayTeam.getName(), date);
    }
}

