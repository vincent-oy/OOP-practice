public class Match {
    private String date;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(String date, Team homeTeam, Team awayTeam) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void setResult(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
  
    public Team getHomeTeam() {
        return homeTeam;
    // return homeTeam.name + " " + homeScore + " - " + awayScore + " " + awayTeam.name + "(" + date + ")";
    // "Tigers 2 - 1 Eagles (12/09/2025)"
    public toString() {
        return String.format("%s %d - %d %s (%s)", homeTeam.name, homeScore, awayScore, awayTeam.name, date);
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    @Override
    public String toString() {
        // return homeTeam.getName() + " " + homeScore + " - " + awayScore +
        //        " " + awayTeam.getName() + " (" + date + ")";
        // Example: "Tigers 2 - 1 Eagles (12/09/2025)"
        return String.format("%s %d - %d %s (%s)",
                homeTeam.getName(), homeScore, awayScore, awayTeam.getName(), date);
    // return homeTeam.name + " " + homeScore + " - " + awayScore + " " + awayTeam.name + "(" + date + ")";
    // "Tigers 2 - 1 Eagles (12/09/2025)"
    public toString() {
        return String.format("%s %d - %d %s (%s)", homeTeam.name, homeScore, awayScore, awayTeam.name, date);
    }
}

