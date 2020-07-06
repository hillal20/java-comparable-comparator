package javaComparableComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {

    public  static void main(String[] args){
        System.out.println(" ==== comparator ===");

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("golf",3000));
        cars.add(new Car("204",2000));
        cars.add(new Car("r4",1000));
        cars.add(new Car("ford",5000));
        cars.add(new Car("toyota",10000));

        Comparator<Car> comparatorOb = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2){
                if(c1.getPrice() > c2.getPrice()){
                    return - 1;
                }
                else{
                    return 1 ;
                }
            }
        };

        Collections.sort(cars, comparatorOb);

        for(Car c : cars){
            System.out.println("car ==> "+ c);
        }

    }
}
