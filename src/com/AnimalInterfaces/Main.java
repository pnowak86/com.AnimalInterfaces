package com.AnimalInterfaces;

import com.AnimalInterfaces.animals.Dog;
import com.AnimalInterfaces.animals.Elephant;
import com.AnimalInterfaces.animals.Snake;
import com.AnimalInterfaces.interfaces.Audible;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("test");

       Zoo zoo = new Zoo();
       zoo.init();
       zoo.runAnimals();//byObjectRef
        System.out.println("");
       zoo.runAnimalsByInterfaceRef();
        System.out.println("");
       zoo.hideAnimalsByInterfaceRef();
        zoo.makeNoiseAnimals();


       Audible someAnimal = zoo.getAudibles().get(0);
       Dog mydog = (Dog)someAnimal;
       mydog.run();
       mydog.hide();
       mydog.makeNoise();

        System.out.println(someAnimal.getClass().getCanonicalName());


    }


}
