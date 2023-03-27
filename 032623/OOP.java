/** public keyword is an access modifier,
        meaning that it is used to set the access level for classes,
        attributes, methods and constructors.

        We divide modifiers into two groups:
        -Access Modifiers: controls the access level.
        -Non Access Modifiers: do not control access level, but provides other functionality.
        **/

//        Access Modifiers:
//        for classes: public or default
//        for attributes, methods and constructors: public, private, default, protected

//        Non Access Modifiers:
//        for classes: final or abstract
//        for attributes, methods: final, static, abstract, transient, synchronized, volatile

        /**
         * static method means that it can be accessed without creating an object
         * public methods must be called by creating objects
         * Car.sayHello(); sayHello method is a static method in Car Class
         * Car c1 = new Car("red", 2023);
         */
public class OOP {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.color = "White";
//        car1.drive();
//        System.out.println(car1.color);
Car car1 = new Car("Black", 2023);
System.out.println(car1.color);
    }

}
