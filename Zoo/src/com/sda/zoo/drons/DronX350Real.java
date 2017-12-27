package com.sda.zoo.drons;

import com.sda.zoo.flyable.Flyable;

/**
 * Created by RENT on 2017-06-02.
 */
public class DronX350Real implements Flyable
{
    @Override
    public int fly() {
        System.out.println("Drrrr Drrrrr!");
        return 0;
    }
}
