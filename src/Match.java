public class Match {
    private String date;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public setResult(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public toString() {
        // return homeTeam.name + " " + homeScore + " - " + awayScore + " " + awayTeam.name + "(" + date + ")";
        // "Tigers 2 - 1 Eagles (12/09/2025)"
        return String.format("%s %d - %d %s (%s)", homeTeam.name, homeScore, awayScore, awayTeam.name, date);
    }
}
public class Match {
    private String date;
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public setResult(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public toString() {
        // return homeTeam.name + " " + homeScore + " - " + awayScore + " " + awayTeam.name + "(" + date + ")";
        // "Tigers 2 - 1 Eagles (12/09/2025)"
        return String.format("%s %d - %d %s (%s)", homeTeam.name, homeScore, awayScore, awayTeam.name, date);
    }
}
