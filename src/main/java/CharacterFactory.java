import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Character[] characters = {new Hobbit(), new Elf(), new Knight(), new King()};
        int ind = new Random().nextInt(characters.length);
        Character new_char = characters[ind-1];
        return new_char;
    }
}
