public class Main {
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

