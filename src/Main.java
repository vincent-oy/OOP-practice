import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // Worksheet: read match data from file
        List<String> lines = Files.readAllLines(Paths.get("data/matches.txt"));

        // Worksheet: create a league
        League league = new League("Sample League");

        Map<String, Team> teams = new HashMap<>();

        // Worksheet: create teams and schedule matches from file
        for (String line : lines) {
            // expected format: home,away,date,homeScore,awayScore
            String[] parts = line.split(",");
            String homeName = parts[0].trim();
            String awayName = parts[1].trim();
            String date = parts[2].trim();
            int homeScore = Integer.parseInt(parts[3].trim());
            int awayScore = Integer.parseInt(parts[4].trim());

            Team home = teams.computeIfAbsent(homeName, Team::new);
            Team away = teams.computeIfAbsent(awayName, Team::new);
            league.addTeam(home);
            league.addTeam(away);

            Match match = new Match(date, home, away);
            match.setResult(homeScore, awayScore);
            league.scheduleMatch(match);
        }

        // Worksheet: update and display standings
    public static void main(String[] args) {
        League league = new League("Sample League");

        Team tigers = new Team("Tigers");
        Team eagles = new Team("Eagles");

        league.addTeam(tigers);
        league.addTeam(eagles);

        Match match1 = new Match("2023-10-10", tigers, eagles);
        match1.setResult(2, 1);
        league.scheduleMatch(match1);

        league.updateStandings();
        league.printStandings();
    }
}

