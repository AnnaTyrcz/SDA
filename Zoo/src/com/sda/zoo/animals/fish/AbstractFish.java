package com.sda.zoo.animals.fish;


import com.sda.zoo.animals.mammals.AbstractAnimals;

/**
 * Created by RENT on 2017-06-02.
 */
public abstract class AbstractFish extends AbstractAnimals {
    private static int FishQuantity;

    String scales;
    String waterType;

    public AbstractFish(int age, int limbs, double weight, String skinColor) {
        super(age, limbs, weight, skinColor);
        this.scales = scales;
        this.waterType = waterType;
        FishQuantity++;
    }

    public static int getFishQuantity() {
        return FishQuantity;
    }
}