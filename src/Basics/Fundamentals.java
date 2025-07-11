package Basics;

public class Fundamentals {
    public static void main(String[] args) {
//        Data Types
        int num = 9;
        double d = 9.8;
        float f = 8.5f;
        char c = 'a';
        boolean a = true; // Boolean -> true/false

        System.out.println("--------------------------------------------------------");
//         Print statement
        System.out.println("Hello, World!");

        System.out.println("--------------------------------------------------------");
//        Function Call
        show();

        System.out.println("--------------------------------------------------------");
//        Different Operators
        int num1 = 9;
        int num2 = 5;

        System.out.println(num1+num2);  // Addition
        System.out.println(num1-num2);  // Subtraction
        System.out.println(num1*num2);  // Multiplication
        System.out.println(num1/num2);  // Division
        System.out.println(num1%num2);  // Modulus
        System.out.println(num1>num2);  // Relational (>, >=, <, <=, ==, !=)
        System.out.println(num1<num2 || num1>num2);  // Logical (&&, ||, !)
        System.out.println(num1>num2 ? "Ts is so true" : "Ts is so false"); // Ternary operator

        System.out.println("--------------------------------------------------------");
//        Conditionals
        if (num1<num2) {
            System.out.println("Condition is False.");
        } else if (num1==num2) {
            System.out.println("Condition is still False.");
        } else {
            System.out.println("For the remaining situation, this will be printed.");
        }

        String role = "Moderator";

        switch (role) {
            case "Administrator" -> System.out.println("Welcome, Admin!");
            case "Moderator" -> System.out.println("Welcome, Mod!");
            default -> System.out.println("Hello, User!");
        }


        System.out.println("--------------------------------------------------------");
//        Iterators
        for (int i = 0; i < 5; i++) {  // Basic for loop
            System.out.println("Hello, World! " + (i+1));
        }

        int i = 0;
        while(i < 5) {   // Basic while loop
            System.out.println("Hello, World! " + (i+1));
            i++;
        }

        i = 0;
        do {
            System.out.println( "Hello, World! " + (i+1));
            i++;
        } while (i < 5);  // Basic do while loop

    }

//    Function/ Method
    public static void show() {
        System.out.println("in show!");
    }
}
