package Assignment;
interface Vehicle {
    void start();
    void stop();
}


class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        
        car.start();
        car.stop();
        
        System.out.println();
        
        bike.start();
        bike.stop();
    }
}

