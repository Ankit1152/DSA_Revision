package OOPS;

interface A {

    // static method :- it cannot be override beacuse in the implementation class,
    // static method is not visible there
    // static metod is called by only one way, using interface name . method name
    static void sayHello() {
        System.out.println("Static methods called of Interface");
    }

    // default method
    default void sayBye() {
        System.out.println("default method called of Interface ");
    }

}

public class StaticMethodsInterface implements A {
    static void sayHello() {
        System.out.println("It is a new method of the Implementation class");
    }

    // default method are only allowed in the interface
    // default void sayBye() {
    // System.out.println("default method called of Interface ");
    // }

    // main method can also be written in Interface
    public static void main(String[] args) {
        StaticMethodsInterface obj = new StaticMethodsInterface();
        obj.sayHello(); // The method sayHello() is undefined for the type
        // StaticMethodsInterface

        obj.sayBye(); // called by the ref variable of the subclass which contains the obj of subclass
        A.sayHello(); // one way to call the static method of interface
    }
}
