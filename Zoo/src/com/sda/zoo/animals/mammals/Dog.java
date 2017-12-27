package com.sda.zoo.animals.mammals;

/**
 * Created by RENT on 2017-06-02.
 */
public class Dog  extends AbstractMammal{
    public Dog(int age, int limbs, double weight, String skinColor, String isWarmBlooded) {
        super(age, limbs, weight, skinColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }

    @Override
    public void eat() {
        System.out.println("Meat!");
    }

   public void isWarmBlooded(boolean warmBlooded) {

           System.out.println("I am warm blooded!");

       } else {
           System.out.println("I am not warm blooded!");
       }
}


