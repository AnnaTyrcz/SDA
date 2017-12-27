package com.sda.zoo.animals.bird;

import com.sda.zoo.animals.mammals.AbstractAnimals;
import com.sda.zoo.flyable.Flyable;

/**
 * Created by RENT on 2017-06-01.
 */
public class AbstractFlyingBird extends AbstractAnimals implements Flyable

{ private static int FlyingBirdQuantity;

String  feathering;
    String beak;
    String wings;

    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {

    }

    @Override
    public String toString() {
        return "AbstractNotFlyingBird{" +
                "feathering='" + feathering + '\'' +
                ", beak='" + beak + '\'' +
                ", wings='" + wings + '\'' +
                "age=" + age +
                ", skinColor='" + skinColor + '\'' +
                ", limbs=" + limbs +
                ", weight=" + weight +
                '}';

    }


    public AbstractFlyingBird(int age, int limbs, double weight, String skinColor, String feathering,
                              String beak, String wings) {
        super(age, limbs, weight, skinColor);
        this.feathering= feathering;
        this.beak = beak;
        this.wings=wings;
        FlyingBirdQuantity++;
    }

    @Override
    public int fly() {
        System.out.println("I am flying!");{
        return FlyingBirdQuantity;
    }
}}
