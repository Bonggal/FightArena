import behaviour.weaponBehaviour.behaviourImplementation.UseBowAndArrow;
import model.Character;
import model.character.King;
import model.character.Knight;
import model.character.Queen;
import model.character.Troll;

public class Main {
    public static void main(String[] args) {
        Character king, queen, knight1, knight2, troll;
        king = new King("Richard");
        queen = new Queen("Victoria");
        knight1 = new Knight("Gregor");
        knight2 = new Knight();
        troll = new Troll();

        knight1.fight(troll);
        king.fight(troll);
        queen.fight(troll);
        knight2.setWeapon(new UseBowAndArrow());
        knight2.fight(troll);
        troll.fight(knight1);
        troll.display();
    }
}
