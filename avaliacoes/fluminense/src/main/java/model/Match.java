package model;

public class Match {
    private String teamA, teamB, data;

    public Match(String teamA, String teamB, String data) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.data = data;
    }

    public String getTeamA() {
        return teamA;
    }
    public String getTeamB() {
        return teamB;
    }
    public String getData()  {
        return data;
    }

    @Override
    public String toString() {
        return teamA + "," + teamB + "," + data;
    }
}