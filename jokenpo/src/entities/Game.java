package entities;

import entities.enums.Hands;

public class Game {
    Player playerOne;
    Player playerTwo;

    Hands handPlayerOne;
    Hands handPlayerTwo;


    public Game(Player playerOne, Player playerTwo, String handPlayerOne, String handPlayerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.handPlayerOne = Hands.valueOf(handPlayerOne);
        this.handPlayerTwo = Hands.valueOf(handPlayerTwo);
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
            return playerOne.getNamePlayer() + "WIN" + "WITH: " + handPlayerOne.name();

        } else if (handPlayerOne == Hands.ROCK && handPlayerTwo == Hands.PAPER) {
            addVictoryForPlayerTwo();
            return playerTwo.getNamePlayer() + "WIN" + "WITH: " + handPlayerTwo.name();

        } else if (handPlayerOne == Hands.PAPER && handPlayerTwo == Hands.ROCK) {
            addVictoryForPlayerOne();
            return playerOne.getNamePlayer() + "WIN" + "WITH: " + handPlayerOne.name();
        }
        else if (handPlayerOne == Hands.PAPER && handPlayerTwo == Hands.SCISSORS) {
            addVictoryForPlayerTwo();
            return playerTwo.getNamePlayer() + "WIN" + "WITH: " + handPlayerTwo.name();
        }
        else if (handPlayerOne == Hands.SCISSORS && handPlayerTwo == Hands.ROCK) {
            addVictoryForPlayerTwo();
            return playerTwo.getNamePlayer() + "WIN" + "WITH: " + handPlayerTwo.name();
        }
        else if (handPlayerOne == Hands.SCISSORS && handPlayerTwo == Hands.PAPER) {
            addVictoryForPlayerOne();
            return playerOne.getNamePlayer() + "WIN" + "WITH: " + handPlayerOne.name();
        }

        return null;
    }
}
