package com.company;

public class Dog extends Animal {

    public Dog(String name,String gender){
        super(name, gender);
        this.price=3000;
        this.maxAge=13;
        this.animalChildren=4;
    }
    public boolean eat(Food f){
        if (!f.name.equals("Meat")){
            return false;
        }
        else {
            return true;
        }
    }
}
