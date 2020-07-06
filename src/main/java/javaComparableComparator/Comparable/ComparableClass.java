package javaComparableComparator.Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {

    public static void main(String[] args){
        System.out.println( " ==== comparable =====");


        List<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop("macBook", 1000,8));
        laptops.add(new Laptop("dell", 400,8));
        laptops.add(new Laptop("macAir", 1500,16));
        laptops.add(new Laptop("accer", 300,8));
        laptops.add(new Laptop("ibm", 1200,16));
        laptops.add(new Laptop("hp", 500,16));

        // we need to sort these objs
        Collections.sort(laptops);

        for(Laptop l : laptops ){
            System.out.println("ram ==> "+l);
        }

    }
}
