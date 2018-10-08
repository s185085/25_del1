import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Die die1;
    private Die die2;
    private Player currentPlayer;

    public Game(){
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        die1 = new Die();
        die2 = new Die();
        currentPlayer = player1;
    }

    public void play(){
        Scanner input = new Scanner(System.in);
        int sumOfDice;
        int sumOfDie1;
        int sumOfDie2;
        int currentScore;
        String winner = "";

        while (currentPlayer.getScore() < 40){
            System.out.println("It is " + currentPlayer.getName() + "'s turn.");
            sumOfDie1 = die1.rollDie();
            sumOfDie2 = die2.rollDie();
            sumOfDice = sumOfDie1 + sumOfDie2;
            currentScore = currentPlayer.getScore();
            currentPlayer.setScore(currentScore + sumOfDice);

            System.out.println(currentPlayer.getScore());
            if (currentPlayer.getScore()>=40){
                winner = currentPlayer.getName();
                break;
            }

            if(currentPlayer == player1){
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        System.out.println("Game over! " + winner + " wins!");
        input.close();
    }
}
