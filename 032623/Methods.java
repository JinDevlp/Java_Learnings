public class Methods {
    public static void main(String[] args) {
        sayHello("Jin", 28);
        int results = addTwoNumbers(2, 5); //detects method with int thanks to method overloading
        double a = addTwoNumbers(6.5,2.2); //detects method with double
        double b = addTwoNumbers(6.5,2.2, 3.1); //detects method with double
        System.out.println(results);
        System.out.println(a);
        System.out.println(b);
    }
    public static void sayHello(String name, int age){
        System.out.println("Hello! " + name + ". You are " + age + " years old");
    }
    public  static  int  addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static double addTwoNumbers(double x, double y){
        return x + y;
    }
    public static double addTwoNumbers(double k, double j,double m){
        return k + j + m;
    }
    }

