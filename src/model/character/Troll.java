package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseAxe;
import model.Character;

public class Troll extends Character {
    public Troll(){
        super.weapon = new UseAxe();
        super.name = "Troll";
    }

    public void display(){
        System.out.println("Grrraaarrr!!!");
    }
}
