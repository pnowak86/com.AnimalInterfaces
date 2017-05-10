package com.AnimalInterfaces;

import com.AnimalInterfaces.animals.Dog;
import com.AnimalInterfaces.animals.Elephant;
import com.AnimalInterfaces.animals.Snake;
import com.AnimalInterfaces.interfaces.Audible;
import com.AnimalInterfaces.interfaces.Moveable;

import javax.tools.Tool;
import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-10.
 */
public class Zoo {
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ArrayList<Elephant> elephants = new ArrayList<>();
    private ArrayList<Snake> snakes = new ArrayList<>();

    public ArrayList<Moveable> getMoveables() {
        return moveables;
    }

    public void setMoveables(ArrayList<Moveable> moveables) {
        this.moveables = moveables;
    }

    public ArrayList<Audible> getAudibles() {
        return audibles;
    }

    public void setAudibles(ArrayList<Audible> audibles) {
        this.audibles = audibles;
    }

    private ArrayList<Moveable> moveables = new ArrayList<>();
    private ArrayList<Audible> audibles = new ArrayList<>();

    public void init() {

        Dog dog = new Dog();
        dogs.add(dog);

        Elephant elephant = new Elephant();
        elephants.add(elephant);

        Snake snake = new Snake();
        snakes.add(snake);

        moveables.add(dog);
        moveables.add(elephant);
        moveables.add(snake);

        audibles.add(dog);
        audibles.add(elephant);
        audibles.add(snake);
    }

    public void runAnimals() {


        for (Dog dog : dogs) {
            dog.run();
        }

        for (Elephant elephant : elephants) {
            elephant.run();
        }

        for (Snake snake : snakes) {
            snake.run();
        }
    }


    //public void makeNoiseAnimals() {


        //for (Dog dog : dogs) {
       //     dog.makeNoise();
       // }

       // for (Elephant elephant : elephants) {
        //    elephant.makeNoise();
       // }

       // for (Snake snake : snakes) {
       //     snake.makeNoise();
       // }
  //  }


    public void runAnimalsByInterfaceRef() {
        for (Moveable moveable : moveables) {
            moveable.run();
        }
    }

    public void hideAnimalsByInterfaceRef() {
        for (Moveable moveable : moveables) {
            moveable.hide();
        }
    }

    public void makeNoiseAnimals() {
        for (Audible audible : audibles) {
            audible.makeNoise();
        }
    }
}
