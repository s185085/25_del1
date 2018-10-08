public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til terningespillet!\n------------------------------------Regler:-----------------------------------------------" +
                "\nThere are two players.\nPlayer 1 throws two dice." +
                "\nHvis vedkommende slår dobbelt må de slå igen.\nEfter hvert terningkast, bliver terningerne lagt til spillerens " +
                "totale point.\nNår spiller 1 slår 2 forskellige terninger er der spiller 2s tur.\nHvis en af spillerne slår to 1'ere, " +
                "bliver deres totale mængde point sat tilbage til 0.\nDen første spiller, som når til 40 point, har vundet." +
                "\n-------------------------------------------------------------------------------------------" +
                "\n\nTryk en tast for at starte.");
        Game diceGame = new Game();
        diceGame.play();
    }
}