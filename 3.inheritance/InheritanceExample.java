class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}
// inheritance is a way to reuse code of existing classes
// when creating a new class, instead of writing new code, the new class
// can inherit the fields and methods of an existing class
// the new class is called the subclass, and the existing class is called the superclass
// the subclass extends the superclass
// the subclass inherits the superclass
// the subclass can add new fields and methods
// the subclass can also override existing superclass methods
// the subclass can also inherit from the superclass.
public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // inherited from Animal
        dog.bark(); // Dog's own method
    }
}
