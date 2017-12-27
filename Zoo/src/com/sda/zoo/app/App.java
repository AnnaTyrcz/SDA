package com.sda.zoo.app;

import com.sda.zoo.animals.birds.Eagle;
import com.sda.zoo.animals.birds.Woodpecker;
import com.sda.zoo.animals.fish.FlyingFish;
import com.sda.zoo.animals.mammals.AbstractAnimals;
import com.sda.zoo.animals.mammals.AbstractMammal;
import com.sda.zoo.animals.mammals.Dog;
import com.sda.zoo.drons.DronX350Real;
import com.sda.zoo.flyable.Flyable;

/**
 * Created by RENT on 2017-06-01.
 */
public class App {
    public static void main(String[] args) {

        AbstractAnimals eagle = new Eagle(1,2,3, "gray", "silver","pointy","long" );
        Woodpecker woodpecker = new Woodpecker(1,2,3, "black", "white", "pointy", "short");
        System.out.println(eagle.getAnimalsquantity());

        Flyable[] flyable = new Flyable[4];
        flyable[0] = new Eagle(1,2,3, "gray", "silver","pointy","long" );
        flyable[1]=new Woodpecker(1,2,3, "black", "white", "pointy", "short");
        flyable[2]=new FlyingFish(1,2,1,"silver", "green","water from river");
        flyable[3]=new DronX350Real();

        for (int i=0; i<4;i++) {
            flyable[i].fly();
        }
        Dog dog=new Dog(1,4,30,"black", "warmBlooded");
    AbstractMammal Borys = new Dog (1,4,30,"black", "warmBlooded");

        System.out.println(eagle.getAnimalsquantity());

    }
    }


