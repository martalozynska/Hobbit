abstract class Character {
    protected int power;
    protected int hp;

    protected abstract void kick(Character c);
    protected boolean isAlive() {
        return hp > 0;
    }
}


