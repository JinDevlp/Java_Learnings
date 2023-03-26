public class Car {
//    crete attributes and methods

//    Attributes
    public int modelYear;
    public String color;

//    Methods
    public void drive(){
        System.out.println("In Drive mode");
    }

//    Constructor
    public Car(String color, int modelYear){
        this.color = color;
        this.modelYear = modelYear;
    }
}
