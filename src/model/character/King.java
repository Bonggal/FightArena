package model.character;

import behaviour.weaponBehaviour.behaviourImplementation.UseBowAndArrow;
import model.Character;

public class King extends Character {
    public King(){
        super.weapon = new UseBowAndArrow();
    }

    public King(String name){
        super.name = "King " + name;
        super.weapon = new UseBowAndArrow();
    }

    public void display(){
        System.out.println("I am a King");
    }
}
