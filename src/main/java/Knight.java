import java.util.Random;

public class Knight extends Character {

    private static final int MAX_POWER = 12;
    private static final int MIN_POWER = 2;
    private static final int MAX_HP = 2;
    private static final int MIN_HP = 21;

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.hp -= rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER;
    }

}
