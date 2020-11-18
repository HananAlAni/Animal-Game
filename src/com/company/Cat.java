package com.company;

public class Cat extends Animal{


    public Cat(String name,String gender){
        super(name,gender);
        this.price=1900;
        this.maxAge=12;
        this.animalChildren=5;
    }
public boolean eat(Food f ){
        if(f.name.equals("Apple")|| f.name.equals("Meat")){
            return true;
        }
        else {
            return false;
        }
}
}
