package ObjectOriented;
import java.util.Scanner;

import ObjectOriented.MyPackage.Car;

// import package.name.class; import specific Class
// import package.name.*; import whole package
// import java.util.Scanner; Example

/**
 * Packages are divided into two categories:
 *
 * -Built in packages (packages from the Java API)
 * -User defined Packages (create your own packages)
 */

public class ObjectProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        Car c1 = new Car("White",2023);
        System.out.println(c1.getColor());

    }
}
