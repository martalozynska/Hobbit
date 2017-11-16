import java.util.Random;

public class King extends Character{
    private static final int MAX_POWER = 15;
    private static final int MIN_POWER = 5;

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.hp -= rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER;
    }
}
