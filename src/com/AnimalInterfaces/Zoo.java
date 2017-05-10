package com.AnimalInterfaces;

import com.AnimalInterfaces.animals.Dog;
import com.AnimalInterfaces.animals.Elephant;
import com.AnimalInterfaces.animals.Snake;
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

    private ArrayList<Moveable> moveables = new ArrayList();

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
    public void runAnimalsByInterfaceRef(){
        for(Moveable moveable: moveables)
        {moveable.run();}

    }
}
