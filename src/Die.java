public class Die {
    private int face;

    public Die(){
    }

    public int rollDie(){
        this.face = (int)(Math.random()*6+1);
        return face;
    }
}