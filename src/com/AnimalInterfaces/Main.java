package com.AnimalInterfaces;

import com.AnimalInterfaces.animals.Dog;
import com.AnimalInterfaces.animals.Elephant;
import com.AnimalInterfaces.animals.Snake;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("test");

       Zoo zoo = new Zoo();
       zoo.init();
       zoo.runAnimals();//byObjectRef
        System.out.println("");
       zoo.runAnimalsByInterfaceRef();
    }


}
