package com.sda.zoo.animals.birds;

import com.sda.zoo.animals.bird.AbstractFlyingBird;

/**
 * Created by RENT on 2017-06-01.
 */
public class Woodpecker extends AbstractFlyingBird {
    public Woodpecker(int age, int limbs, double weight, String skinColor, String feathering, String beak, String wings) {
        super(age, limbs, weight, skinColor, feathering, beak, wings);
    }
    public void poke() {
        System.out.println("I am poking!");
    }
    public void makeSound(){
        System.out.println("Dziub dziub");
    }
    public void eat(){
        System.out.println("I am eating worms!");
    }
    @Override
    public int fly() {
        System.out.println("Szuu Szuuu");
        return 0;
    } }
