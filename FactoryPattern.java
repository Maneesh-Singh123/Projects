package Assignment;


interface Shape {
    void draw();
}


class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

interface ShapeFactory {
    Shape createShape();
}

// Concrete factories
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

public class FactoryPattern{
    public static void main(String[] args) {
      
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();

        circle.draw();
        rectangle.draw();
    }
}

