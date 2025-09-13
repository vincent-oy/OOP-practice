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

    public addTeam(Team t) {
        teams.add(t);
   }

    public scheduleMatch(Match m) {
        matches.add(m);
    }

    public updateStandings() {
        for (Match eachMatch : matches) {
            eachMatch.homeTeam.updateStats(eachMatch);
            eachMatch.awayTeam.updateStats(eachMatch);
        }
    }

    public printStandings() {
        for (Team eachTeam : teams) {
            System.out.println(eachTeam.getRecord());
        }
    }
}