package com.AnimalInterfaces.animals;

import com.AnimalInterfaces.interfaces.Audible;
import com.AnimalInterfaces.interfaces.Moveable;

/**
 * Created by RENT on 2017-05-10.
 */
public class Snake implements Moveable, Audible{

    @Override
    public void run() {
        System.out.println("Snake: I'm running!");
    }

    @Override
    public void hide() {
        System.out.println("Snake: I'm hiding!");
    }


    @Override
    public void makeNoise() {
        System.out.println("S nake: I'm noisy");
    }
}
