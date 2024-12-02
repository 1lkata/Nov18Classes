public class Composition {
    public static void main(String[] args) {

        // Task 5: Create an Engine object with a type of "V8".
        Engine engine = new Engine("V8");
        // Task 6: Create a Car object with the brand "Ford", the Engine object, and wheel size of 18 inches.
        Car ford = new Car("Ford",engine,18);
        // Task 7: Call the displayInfo() method to print the car's details.
        ford.displayInfo();
    }
}

record Engine(String type) {
}

record Wheel(int size) {
}

class Car {
    private final String brand;
    private final Engine engine;
    private final Wheel frontLeftWheel;  // Task 1: Add three more wheel objects (frontRightWheel, rearLeftWheel, rearRightWheel).
    private final Wheel frontRightWheel;
    private final Wheel rearLeftWheel;
    private final Wheel rearRightWheel;

    public Car(String brand, Engine engine, int wheelSize) {
        this.brand = brand;
        this.engine = engine;

        // Task 2: Initialize all the Wheel objects inside the constructor.
        this.frontLeftWheel = new Wheel(wheelSize);
        this.frontRightWheel = new Wheel(wheelSize);
        this.rearLeftWheel = new Wheel(wheelSize);
        this.rearRightWheel = new Wheel(wheelSize);
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.type());
        System.out.println("Front Left Wheel Size: " + frontLeftWheel.size() + " cm");

        // Task 3: Add print statements for the sizes of the other three wheels.
        System.out.println("Front Right Wheel Size: " + frontRightWheel.size() + " cm");
        System.out.println("Rear Left Wheel Size: " + rearLeftWheel.size() + " cm");
        System.out.println("Rear Right Wheel Size: " + rearRightWheel.size() + " cm");
    }

    // Task 4: Write a getter method for the 'brand' field.
    public String getBrand() {
        return brand;
    }
}