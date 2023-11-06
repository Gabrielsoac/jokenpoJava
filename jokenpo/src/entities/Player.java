package entities;

public class Player {

    private String namePlayer;
    private Integer totalPointsPlayer;
    private Integer totalwinsPlayer;
    private Integer totalLosePlayer;

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
        return totalwinsPlayer;
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
        totalwinsPlayer += 1;
    }

    public void addOneLose(){
        totalLosePlayer += 1;
    }
}
