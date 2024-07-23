// package OOPS;
// // Base class
// class Employee {
//     String name;
//     int id;

//     Employee(String name, int id) {
//         this.name = name;
//         this.id = id;
//     }
//     void display() {
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee ID: " + id);
//     }
// }

// // Derived class
// class Developer extends Employee {
//     String technology;

//     Developer(String name, int id, String technology) {
//         super(name, id);
//         this.technology = technology;
//     }

//     void display() {
//         super.display();
//         System.out.println("Technology: " + technology);
//     }
// }

// // Main class to demonstrate
// public class SingleLevelInheritance {
//     public static void main(String[] args) {
//         Developer dev = new Developer("John Doe", 123, "Java");
//         dev.display();
//     }
// }
