package Assignment;

class Person {
    private String name;
    private int age;

 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

       
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        
        person.setName("Bob");
        person.setAge(-25); 

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}

