package inheritance;
import inheritance.Package.Car;

public class Inheritance {
    public static void main(String[] args) {
        Car tesla = new Car("Black", 2024);
        String color = tesla.getColor();
        int year = tesla.getModelYear();
        tesla.horn();
        System.out.println("Car color: "+ color + " and Car year: "+ year);




    }
}
