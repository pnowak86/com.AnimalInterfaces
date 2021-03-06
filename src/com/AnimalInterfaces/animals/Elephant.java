package com.AnimalInterfaces.animals;

import com.AnimalInterfaces.interfaces.Audible;
import com.AnimalInterfaces.interfaces.Moveable;

/**
 * Created by RENT on 2017-05-10.
 */
public class Elephant implements Moveable, Audible {

    @Override
    public void run() {
        System.out.println("Elephant: I'm running!");
    }

    @Override
    public void hide() {
        System.out.println("Elephant: I'm hiding!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Elephant: I'm noisy");
    }
}
