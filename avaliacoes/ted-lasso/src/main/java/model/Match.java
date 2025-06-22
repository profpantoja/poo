package model;

import java.util.Date;

/**
 * A classe Match define uma partida de futebol no universo da série "Ted lasso"
 * 
 */
public class Match {

    private Team home;
    private Team visitor;
    private int homeScore;
    private int visitorScore;
    private Date date;

    /**
     * Getter padrão para o atributo "home" (Time da casa na partida).
     *
     * @return o atributo home
     */
    public Team getHome() {
        return this.home;
    }
    /**
     * Setter padrão para o atributo "home".
     * 
     * @param home Time da casa na partida
     */
    public void setHome(Team home) {
        this.home = home;
    }

    /**
     * Getter padrão para o atributo "visitor" (Time visitante na partida).
     *
     * @return o atributo visitor
     */
    public Team getVisitor() {
        return this.visitor;
    }
    
    /**
     * Setter padrão para o atributo "visitor".
     * 
     * @param visitor Time visitante na partida
     */
    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }

    /**
     * Getter padrão para o atributo "homeScore" (Gols marcados pelo time da casa).
     *
     * @return o atributo homeScore
     */
    public int getHomeScore() {
        return this.homeScore;
    }

    /**
     * Setter padrão para o atributo "homeScore".
     * 
     * @param homeScore Gols marcados pelo time da casa
     */
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    
    /**
     * Getter padrão para o atributo "visitorScore" (Gols marcados pelo time visitante).
     *
     * @return o atributo visitorScore
     */ 
    public int getVisitorScore() {
        return this.visitorScore;
    }

    /**
     * Setter padrão para o atributo "visitorScore".
     * 
     * @param visitorScore Gols marcados pelo time visitante
     */
    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }
    
    /**
     * Getter padrão para o atributo "date" (Data em que a partida foi realizada).
     *
     * @return o atributo date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter padrão para o atributo "date".
     * 
     * @param date Data em que a partida foi realizada
     */
    public void setDate(Date date) {
        this.date = date;
    }   

    /**
     * O método getResult é utilizado para definir o resultado da partida 
     * 
     * @return o time da casa se a quantidade de gols marcados pelo time da casa for maior que a do time visitante,
     *         o time visitante se a quantidade de gols marcados pelo time visitante for maior que a do time da casa ou
     *         nulo se a quantidade de gols marcados for igual para ambos os lados (empate)
     */
    public Team getResult(){
        if(homeScore > visitorScore){
            return home;
        }
        else if(visitorScore > homeScore){
            return visitor;
        }
        else{
            return null;
        }
    }

    /**
     * Sobrecarga do método getResult para definir a quantidade de pontos feitos na partida pelo time referido no parâmetro do método 
     * 
     * @param team Um dos times que jogou a partida 
     * @return  Se o time referido for o time da casa, 3 se a quantidade de gols marcados pelo time da casa for maior que a do time visitante,
     *          0 se a quantidade de gols marcados pelo time visitante for maior que a do time da casa ou
     *          1 se a quantidade de gols marcados for igual para ambos os lados,
     *          se o time referido for o time visitante, 3 se a quantidade de gols marcados pelo time visitante for maior que a do time da casa,
     *          0 se a quantidade de gols marcados pelo time da casa for maior que a do time visitante ou
     *          1 se a quantidade de gols marcados for igual para ambos os lados
     */
    public int getResult(Team team){
        if(team == home){
            if(homeScore > visitorScore){
                return 3;
            }
            else if(visitorScore > homeScore){
                return 0;
            }
            else{ 
                return 1;
            }
        }
        else{
            if(visitorScore > homeScore){
                return 3;
            } 
            else if(homeScore > visitorScore){
                return 0;
            } 
            else{ 
                return 1;
            }
        }
    }
}
