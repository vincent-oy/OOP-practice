import java.util.ArrayList;

public class League {
    //Attributes
    private String name;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    
    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addTeam(Team t) {
        teams.add(t);
    }

    public void scheduleMatch(Match m) {
        matches.add(m);
    }

    public void updateStandings() {
        for (Match eachMatch : matches) {
            eachMatch.homeTeam.updateStats(eachMatch);
            eachMatch.awayTeam.updateStats(eachMatch);
        }
    }

    public void printStandings() {
        for (Team eachTeam : teams) {
            System.out.println(eachTeam.getRecord());
        }
    }

}
