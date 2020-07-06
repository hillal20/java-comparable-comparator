package javaComparableComparator.Comparable;
import java.lang.Comparable;
class Laptop implements Comparable<Laptop> {
    private String name;
    private int price;
    private int ram;

    // this is coming from comparable
    @Override
    public int compareTo(Laptop lap) {
        /* since we are comparing, we need 2 objects, but we have only one which is passed as a param into compareTo (lap).
        the trick is that the other object is created by java from this class (Laptop) and it is automatically
        using it, and the function compareTo is part of it, we access to it by using this keyword.
        lap is coming from the list that we are sorting
         */

        // let say we need to sort based on the ram
        if(this.getRam() > lap.getRam()){
            // it has to be positive number
            return 1;
        }
        else {
            return -1;
        }
    }

    public Laptop(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }


}