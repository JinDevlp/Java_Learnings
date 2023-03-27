public class Car {
//    crete attributes and methods

    // Attributes
    private int modelYear;
    private String color;

    // Encapsulation

// Getter
    public int getModelYear(){
        return modelYear;
    }

    public String getColor() {
        return this.color;
    }

// Setter
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

// Constructor
    public Car(String color, int modelYear){
        this.color = color;
        this.modelYear = modelYear;
    }

    static void sayHello(){
        System.out.println("Hello!");
    }

// Methods
    public void drive(){
        System.out.println("In Drive mode");
    }
}
