package com.practice.collections.Queue.comparator;

import java.util.Arrays;

public class ObjectComparator {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];

        carArray[0] = new Car("suv","Petrol");
        carArray[1] = new Car("sedan","Diesel");
        carArray[2] = new Car("hatchback","cng");

        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.modelName.compareTo(obj1.modelName));
        for(Car car:carArray){
            System.out.println(car.modelName + "   " + car.type);
        }
    }




}
