package com.company;

public class Rabbit extends Animal {

    public Rabbit(String name,String gender){
        super(name, gender);
        this.price=800;
        this.maxAge=6;
        this.animalChildren=8;
    }

    public boolean eat(Food f){
        if (!f.name.equals("Carrot")){
            return false;
        }
        else {
            return true;
        }
    }
}
