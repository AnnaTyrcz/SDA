package com.sda.zoo.animals.fish;

/**
 * Created by RENT on 2017-06-02.
 */
public class Shark extends AbstractFish {

    public Shark(int age, int limbs, double weight, String skinColor) {
        super(age, limbs, weight, skinColor);
    }

    @Override
    public void makeSound() {
        System.out.println("I am shark!");
    }

    @Override
    public void eat() {
        System.out.println("I am eating fishes!");
    }
}
