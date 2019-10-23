import model.Character;
import model.character.King;
import model.character.Knight;
import model.character.Queen;
import model.character.Troll;

public class Main {
    public static void main(String[] args) {
        Character king, queen, knight, troll;
        king = new King();
        queen = new Queen();
        knight = new Knight();
        troll = new Troll();

        knight.fight();
        king.fight();
        queen.fight();
        troll.fight();
    }
}
