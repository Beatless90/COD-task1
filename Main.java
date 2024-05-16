package net.codtech;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Basic Calculator!");
        
        // Prompting the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Prompting the user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        scanner.close();
        
        // Performing the selected operation
        switch (choice) {
            case 1:
                result = Calculator.add(num1, num2);
                break;
            case 2:
                result = Calculator.subtract(num1, num2);
                break;
            case 3:
                result = Calculator.multiply(num1, num2);
                break;
            case 4:
                result = Calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        // Displaying the result to the user
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}