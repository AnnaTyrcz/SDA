package com.sda.zoo.animals.fish;

import com.sda.zoo.flyable.Flyable;

/**
 * Created by RENT on 2017-06-02.
 */
public class FlyingFish extends AbstractFish implements Flyable
{
    public FlyingFish(int age, int limbs, double weight, String silver, String green, String skinColor) {
        super(age, limbs, weight, skinColor);
    }



    @Override
    public void makeSound() {
        System.out.println("Gul gul!");
    }

    @Override
    public void eat() {
        System.out.println("I am eating alga!");
    }

    @Override
    public int fly() {
        System.out.println("plum plum");
        return 0;
    }
}
