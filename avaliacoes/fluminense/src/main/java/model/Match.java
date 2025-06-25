package model;

import java.util.Date;

/**
 * Represents a match between two teams, including information about the teams, their scores,
 * and the date the match was played.
 *
 * <p>This class provides methods to set and retrieve match details, as well as determine the result of the match.</p>
 *
 * @author Documentation: Rebecca.
 */
public class Match {

    /** The home team */
    private Team home;

    /** The visiting team */
    
    private Team visitor;

    /** The score of the home team */
    private int homeScore;

    /** The score of the visiting team */
    private int visitorScore;

    /** The date the match was played */
    private Date date;
    
    /**
     * Returns the home team.
     * @see #setHome(Team)
     * @return the home team
     */
    public Team getHome() {
        return home;
    }

    /**
     * Sets the home team.
     *
     * @param home the home team to set
     */
    public void setHome(Team home) {
        this.home = home;
    }

    /**
     * Returns the visiting team.
     *
     * @return the visiting team
     */
    public Team getVisitor() {
        return visitor;
    }

    /**
     * Sets the visiting team.
     *
     * @param visitor the visiting team to set
     */
    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }

    /**
     * Returns the score of the home team.
     *
     * @return the home team's score
     */
    public int getHomeScore() {
        return homeScore;
    }

    /**
     * Sets the score of the home team.
     *
     * @param homeScore the score to set for the home team
     */
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    /**
     * Returns the score of the visiting team.
     *
     * @return the visiting team's score
     */
    public int getVisitorScore() {
        return visitorScore;
    }

    /**
     * Sets the score of the visiting team.
     *
     * @param visitorScore the score to set for the visiting team
     */
    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    /**
     * Returns the date the match was played.
     *
     * @return the date of the match
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date the match was played.
     *
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns the winning team of the match.
     *
     * @return the winning team, or {@code null} if the match is a draw
     */
    public Team getResult(){
        if (homeScore < visitorScore)
            return visitor;
        else {
            if (homeScore > visitorScore)
                return home;
            else
                return null;
        }
    }

    /**
     * Returns the result points for a given team in this match.
     * <ul>
     *   <li>3 points for a win</li>
     *   <li>1 point for a draw</li>
     *   <li>0 points for a loss</li>
     * </ul>
     *
     * @param t the team for which to retrieve the result points
     * @return the number of points earned by the team in this match
     */
    public int getResult(Team t) {
        if (t == home && homeScore > visitorScore)
            return 3;
        else if (t == visitor && homeScore < visitorScore)
            return 3;
        else if (t == home && homeScore < visitorScore)
            return 0;
        else if (t == visitor && homeScore > visitorScore)
            return 0;
        else
            return 1;
    }

}
