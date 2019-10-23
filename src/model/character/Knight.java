package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseSword;
import model.Character;

public class Knight extends Character {

    public Knight() {
        weapon = new UseSword();
    }

    public Knight(String name) {
        super.name = "Sir " + name;
        weapon = new UseSword();
    }

    public void display(){
        System.out.println("I am a Knight");
    }

}
