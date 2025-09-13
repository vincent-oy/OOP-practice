import java.util.ArrayList;

public class League {
    private String name;
    // Using ArrayList directly as requested
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
        for (Match match : matches) {
            match.getHomeTeam().updateStats(match);
            match.getAwayTeam().updateStats(match);
        }
    }

    public void printStandings() {
        for (Team team : teams) {
            System.out.println(team.getRecord());
        }
    }
}

