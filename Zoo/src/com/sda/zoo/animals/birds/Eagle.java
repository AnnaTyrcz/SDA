package com.sda.zoo.animals.birds;

import com.sda.zoo.animals.bird.AbstractFlyingBird;

/**
 * Created by RENT on 2017-06-01.
 */
public class Eagle extends AbstractFlyingBird {
    public Eagle(int age, int limbs, double weight, String skinColor, String feathering, String beak, String wings) {
        super(age, limbs, weight, skinColor, feathering, beak, wings);
    }

    public void hunting() {
        System.out.println("I am hunting!");
    }
        public void makeSound(){
        System.out.println("KRRRR KRRRR");
    }

    public void eat(){
        System.out.println("meat");
    }

    @Override
    public int fly() {
        System.out.println("Fru fru");
        return 0;
    } }

