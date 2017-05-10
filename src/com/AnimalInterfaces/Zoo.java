package com.AnimalInterfaces;

import com.AnimalInterfaces.animals.Dog;
import com.AnimalInterfaces.animals.Elephant;
import com.AnimalInterfaces.animals.Snake;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-10.
 */
public class Zoo {
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<Elephant> elephants = new ArrayList<>();
    private ArrayList<Snake> snakes = new ArrayList<>();
    public void init() {


        dogs.add(new Dog());


        elephants.add(new Elephant());


        snakes.add(new Snake());

    }

    public void runAnimals(){

    }
}
