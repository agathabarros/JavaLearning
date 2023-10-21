// class Car is a example of a class that has two instance variables
// instance make and instance model, and no methods

class Car {
    String make;
    String model;
}
public class CarExample {
    public static void main(String [] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        System.out.println("Car 1: " + car1.make + " " + car1.model);
    }
}
