package com.company;

public class Parrot extends Animal{

    public Parrot(String name, String gender){
        super(name, gender);
        this.price=2000;
        this.maxAge=5;
        this.animalChildren=2;
    }
    public boolean eat(Food f){
        if (!f.name.equals("Apple")){
            return false;
        }
        return true;
    }
}
