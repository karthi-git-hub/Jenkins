class Car {
    String color;
    
    // User-defined method
    void displayColor() {
        System.out.println("The car color is: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object using the 'new' keyword
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.displayColor();
    }
}
