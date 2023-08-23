package Assignment;
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is golden in color.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        
        labrador.eat();   // Inherited from Animal class
        labrador.bark();  // Inherited from Dog class
        labrador.color(); // Defined in Labrador class
    }
}

