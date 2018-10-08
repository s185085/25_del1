public class Player {
    private int score;
    private String name;

    public Player(String name){
        this.score = 0;
        this.name = name;
    }
    public int getScore(){
        return this.score;
    }
    public void setScore(int newScore){
        this.score = newScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
