

inteface Shape {
    void draw();
}
class Circle implements Shape {
    @Override // this is a annotation, it tells the compiler that the following method overrides a method in its superclass
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        shape1.draw();
        shape2.draw();
    }
}
