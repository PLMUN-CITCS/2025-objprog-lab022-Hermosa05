// CarDemo.java

class Car {
    String make;
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[]args) {
        Car myCar = new Car();

        // Set the car's attributes
        myCar.year = 2020;
        myCar.make = "Toyota";
        myCar.model = "Corolla";

        // Call the displayInfo method to print the car's information
        myCar.displayInfo();
    }
}