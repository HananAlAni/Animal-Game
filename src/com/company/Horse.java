package com.company;

public class Horse extends Animal{

    public Horse(String name, String gender){
        super(name, gender);
        this.price=1500;
        this.maxAge=10;
        this.animalChildren=1;
    }
    public boolean eat(Food f){
        if (!f.name.equals("Apple")){
            return false;

        }
        else {
            return true;
        }
    }
}
