public class GameManager extends CharacterFactory {


    public void fight(Character c1, Character c2) {
        while (c1.isAlive() || c2.isAlive()) {
            c1.kick(c2);
            c2.kick(c1);
            if (c1.isAlive() && c2.isAlive() == false) {
                System.out.println("The second character is dead");
            }
            else if (c2.isAlive() && c1.isAlive() == false) {
                System.out.println("The first character is dead");
            }

        }
    }
}
