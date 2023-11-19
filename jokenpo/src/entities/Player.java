package entities;

import java.util.Scanner;

public class Player {

    private String namePlayer;
    private int totalPointsPlayer;
    private int totalWinsPlayer;
    private int totalLosePlayer;

    public Player(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    //Getter and Setter namePlayer
    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    // Getter total win and lose
    public Integer getTotalwinsPlayer() {
        return totalWinsPlayer;
    }

    public Integer getTotalLosePlayer() {
        return totalLosePlayer;
    }

    public Integer getTotalPointsPlayer(){
        return totalPointsPlayer;
    }
    //methods

    //points score
    public void addOnePointForVictory(){
        totalPointsPlayer += 1;
    }
    public void removeOnePointForLose(){
        totalPointsPlayer -= 1;
    }

    //rounds

    public void addOneVictory(){
        this.totalWinsPlayer += 1;
    }

    public void addOneLose(){
        this.totalLosePlayer += 1;
    }
}
