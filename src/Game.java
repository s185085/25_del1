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
        int sumDie1;
        int sumDie2;
        int sumOfDice;
        Scanner scanner = new Scanner(System.in);

        while(currentPlayer.getScore() < 40){
            System.out.println("It is " + currentPlayer.getName() + "s turn. Type 1 to roll the die ");
            int i = scanner.nextInt();
            if(i == 1){
                sumDie1 = die1.rollDie();
                sumDie2 = die2.rollDie();
                sumOfDice = sumDie1 + sumDie2;
                System.out.println(currentPlayer.getName() + " Rolled " + sumDie1 + " and " + sumDie2 + " for a total sum of " + sumOfDice);



                currentPlayer.updateScore(sumOfDice);

                if(sumDie1 == 1 && sumDie2 == 1){
                    currentPlayer.updateScore(0);
                    System.out.println("You rolled two 1's and your score is set to 0 :/");
                }



                System.out.println(currentPlayer.getName() + " now has " + currentPlayer.getScore() + " points");

                if(currentPlayer.getScore() >= 40){
                    System.out.println(currentPlayer.getName() + " wins");

                    break;
                }

                if(currentPlayer == player1){
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }

                if(sumDie1 == sumDie2){
                    if(currentPlayer == player1){
                        currentPlayer = player2;
                    } else {
                        currentPlayer = player1;
                    }
                    System.out.println(currentPlayer.getName() + " gets an ekstra turn");
                }


            } else {
                System.out.println("Thats not a valid input");
            }
        }
    }
}

