import java.util.ArrayList;

public class League {
    private String name;

    // Worksheet: store all teams in an ArrayList
    // Using ArrayList directly as requested
    private ArrayList<Team> teams;

    // Worksheet: store all matches in an ArrayList
    private ArrayList<Match> matches;

    // Worksheet: constructor initializes league name and empty lists
    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Worksheet: add a team to the league (avoid duplicates)
    public void addTeam(Team t) {
        if (!teams.contains(t)) {
            teams.add(t);
        }
    }

    // Worksheet: schedule a match to be played
    public void addTeam(Team t) {
        teams.add(t);
    }

    public void scheduleMatch(Match m) {
        matches.add(m);
    }

    // Worksheet: update stats for every scheduled match
    public void updateStandings() {
        for (Match match : matches) {
            match.getHomeTeam().updateStats(match);
            match.getAwayTeam().updateStats(match);
        }
    }

    // Worksheet: display each team's record
    public void printStandings() {
        for (Team team : teams) {
            System.out.println(team.getRecord());
        }
    }
}

        for (Match eachMatch : matches) {
            eachMatch.homeTeam.updateStats(eachMatch);
            eachMatch.awayTeam.updateStats(eachMatch);        }
    }

    public void printStandings() {
        for (Team team : teams) {
            System.out.println(team.getRecord());
        }
    }
}
        for (Team eachTeam : teams) {
            System.out.println(eachTeam.getRecord());
        }
    }

}
