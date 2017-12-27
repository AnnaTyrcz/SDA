package com.sda.zoo.animals.bird;

import com.sda.zoo.animals.mammals.AbstractAnimals;

/**
 * Created by RENT on 2017-06-01.
 */
public class AbstractNotFlyingBird extends AbstractAnimals {
    private static int NonFlyingBirdQuantity;

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


    public AbstractNotFlyingBird(int age, int limbs, double weight, String skinColor, String feathering,
                                 String beak, String wings) {
        super(age, limbs, weight, skinColor);
        this.feathering= feathering;
        this.beak = beak;
        this.wings=wings;
       NonFlyingBirdQuantity++;}



            public static int getNonFlyingBirdQuantity () {
            return NonFlyingBirdQuantity();
        }
        }

