package Assignment;


    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    // Subclass
    class Dog extends Animal {
        // Method overriding - providing a specific implementation of sound() in the subclass
        @Override
        void sound() {
            super.sound();
            System.out.println("Dog barks");
        }
    }
    
    public class MethodOveridding {
        public static void main(String[] args) {
          
            
            Animal animal = new Animal();
            animal.sound(); 
            Animal animal1 = new Dog();
            animal1.sound(); 
            animal1 = new Dog();
            animal1.sound(); 
            Dog dog = new Dog();
            dog.sound();
         
        }
    }
    

