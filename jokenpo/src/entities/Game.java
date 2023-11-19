package entities;
import Exceptions.HandException;
import entities.enums.Hands;

import java.util.Scanner;

public class Game {
    private Player playerOne;
    private Player playerTwo;
    private Hands handPlayerOne;
    private Hands handPlayerTwo;


    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        }

    public void chooseHands(String handOne, String handTwo) throws IllegalArgumentException {
            this.handPlayerOne = Hands.valueOf(handOne);
            this.handPlayerTwo = Hands.valueOf(handTwo);
        }

    public String gameResult() {
        String result = analyzeGame();
        if (result == null){
            return "Empate!";
        }

        return result;
    }

    public void addVictoryForPlayerOne(){
        playerOne.addOneVictory();
        playerOne.addOnePointForVictory();
        playerTwo.addOneLose();
        playerTwo.removeOnePointForLose();
    }
    public void addVictoryForPlayerTwo(){
        playerTwo.addOneVictory();
        playerTwo.addOnePointForVictory();
        playerOne.addOneLose();
        playerOne.removeOnePointForLose();
    }

    public String analyzeGame() {

        if (handPlayerOne == Hands.ROCK && handPlayerTwo == Hands.SCISSORS) {
            addVictoryForPlayerOne();
            return playerOne.getNamePlayer().toUpperCase() + " WIN " + "WITH: " + handPlayerOne.name();

        } else if (handPlayerOne == Hands.ROCK && handPlayerTwo == Hands.PAPER) {
            addVictoryForPlayerTwo();
            return playerTwo.getNamePlayer().toUpperCase() + " WIN " + "WITH: " + handPlayerTwo.name();

        } else if (handPlayerOne == Hands.PAPER && handPlayerTwo == Hands.ROCK) {
            addVictoryForPlayerOne();
            return playerOne.getNamePlayer().toUpperCase() + " WIN " + "WITH: " + handPlayerOne.name();
        }
        else if (handPlayerOne == Hands.PAPER && handPlayerTwo == Hands.SCISSORS) {
            addVictoryForPlayerTwo();
            return playerTwo.getNamePlayer().toUpperCase() + " WIN " + "WITH: " + handPlayerTwo.name();
        }
        else if (handPlayerOne == Hands.SCISSORS && handPlayerTwo == Hands.ROCK) {
            addVictoryForPlayerTwo();
            return playerTwo.getNamePlayer().toUpperCase() + " WIN " + "WITH: " + handPlayerTwo.name();
        }
        else if (handPlayerOne == Hands.SCISSORS && handPlayerTwo == Hands.PAPER) {
            addVictoryForPlayerOne();
            return playerOne.getNamePlayer().toUpperCase() + " WIN " + "WITH: " + handPlayerOne.name();
        }

        return null;
    }
}
