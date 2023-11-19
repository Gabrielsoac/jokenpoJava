package application;

import Exceptions.HandException;
import entities.Game;
import entities.Player;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public void menuOptions() {

        System.out.println("### THE GAME ROCK, PAPER AND SCISSOR ###\n");
        System.out.println("""
                MENU
                (1) GAME
                (2) EXIT""");

        System.out.println("Please, choose the option:\n");
    }

    public void navegateMenu() {

        Scanner input = new Scanner(System.in);

        Integer navegateMenuActive = 0;
        while (navegateMenuActive != null) {

            menuOptions();

            System.out.println("Enter the option:");
            navegateMenuActive = input.nextInt();
            input.nextLine();

            if (navegateMenuActive == 1) {

                String[] namePlayers = new String[2];
                System.out.println("Enter the name player 1:\n");
                namePlayers[0] = input.nextLine();
                System.out.println("Enter the name player 2:\n");
                namePlayers[1] = input.nextLine();


                Player playerOne = new Player(namePlayers[0]);
                Player playerTwo = new Player(namePlayers[1]);

                Game game = new Game(playerOne, playerTwo);

                System.out.println("Enter the hand player one: OPTIONS: ROCK, PAPER, SCISSORS");
                String handPlayerOne = input.nextLine().toUpperCase();
                System.out.println("Enter the hand player one: OPTIONS: ROCK, PAPER, SCISSORS");
                String handPlayerTwo = input.nextLine().toUpperCase();

                try {
                    game.chooseHands(handPlayerOne, handPlayerTwo);
                }
                catch (IllegalArgumentException e){
                    System.out.println("Por favor, digite apenas opções válidas para a mão, jogo cancelado");
                    continue;
                }

                System.out.println(game.gameResult());
                boolean playAgain = playGameAgain();

                if (playAgain == true){
                    continue;
                }
                else {
                    navegateMenuActive = null;
                }
            }

            if (navegateMenuActive == 2) {
                System.out.println("Thank you for play the game!");
                input.close();
                navegateMenuActive = null;

            }
        }
    }
    public boolean playGameAgain() {
        System.out.println("""
                Play again?
                (0) NO
                (1) YES\n""");
        Scanner input = new Scanner(System.in);

        int again = input.nextInt();
        input.nextLine();

        if (again == 1) {
            return true;

        } else if (again == 0) {
            return false;

        } else {
            playGameAgain();
        }
        return false;
    }
}
