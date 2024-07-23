// Abstraction :- Hiding all the unnecessary details and showing only the important parts to the user. 
// It gives an idea but not implementation.

// abstract class  
// :- cannot create an instance of abstract class
// :- can have abstract or non abstract method
// :- can have constructors
abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    // Non abstract methods
    void eating() {
        System.out.println("Animal eats");
    }

    // Abstract method
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eating();
        h.walk();
        System.out.println(h.color);
        // Chicken ch = new Chicken();
        // ch.eat();
        // ch.walk();
    }
}
