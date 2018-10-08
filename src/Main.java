public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Dice Game!\n------------------------------------Rules:-----------------------------------------------" +
                "\nThere are two players in the game.\nThe game is turn based, and Player 1 gets to start.\nThe current player rolls two dice each turn." +
                "\nIf the player rolls two similar dice, they get an extra turn.\nAfter each throw, the sum of the dice are added to the players " +
                "total amount of points.\nThe other player gets to roll once the current player rolls two different dice.\nIf a player rolls two 1's, " +
                "it results in their total score being set to 0.\nThe first player to reach a score of 40 points or more, wins." +
                "\n------------------------------------------------------------------------------------------\n\n");
        Game diceGame = new Game();
        diceGame.play();
    }
}