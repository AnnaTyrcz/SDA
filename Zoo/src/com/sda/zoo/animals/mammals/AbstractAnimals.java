package com.sda.zoo.animals.mammals;

/**
 * Created by RENT on 2017-06-01.
 */
public abstract class AbstractAnimals {


    public AbstractAnimals(int age, int limbs, double weight, String skinColor) {
        this.age=age;
        this.limbs=limbs;
        this.weight=weight;
        this.skinColor=skinColor;
        AnimalsQuantity++;
    }

    protected int age;
    protected String skinColor;
    protected int limbs;
    protected double weight;
    private static int AnimalsQuantity;

    public abstract void makeSound();

    public abstract void eat();

    public static int getAnimalsquantity() {
        return AnimalsQuantity;
    }

    @Override
    public String toString() {
        return "AbstracAnimals{" +
                "age=" + age +
                ", skinColor='" + skinColor + '\'' +
                ", limbs=" + limbs +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getLimbs(){
        return  limbs;
    }

    public void setLimbs(int limbs){
        this.limbs=limbs;

    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getSkinColor(){
        return skinColor;
    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
