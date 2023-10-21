// Encapsulation is the process of hiding the internal workings of an object from the outside world.
// In Java, encapsulation is done using classes and methods.
// A class is a blueprint for an object and defines the initial state (variables) and 
//behavior (methods) of the objects that are created from it.
class Person {
    private String name; // private instance variable

    public String getName() { // getter method
        return name;
    }
    public void setName(String newName) { // setter method
        name = newName;
    }
}
// The Person class has a private instance variable called name.
public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person(); // create a new Person object
        person.setName("John"); // set the value of the name variable to "John"
        System.out.println("Person's name:" + person.getName());
    }
}
