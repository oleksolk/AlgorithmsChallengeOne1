import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the desired Fibonacci number: ");
        int index = scanner.nextInt();
        scanner.close();

        int fibonacci = getFibonacci(index);
        System.out.println("The Fibonacci number at index " + index + " is " + fibonacci);
    }

    public static int getFibonacci(int index) {
        if (index <= 1) {
            return index;
        }
        int previousFibonacci = 0;
        int currentFibonacci = 1;
        for (int i = 2; i <= index; i++) {
            int nextFibonacci = previousFibonacci + currentFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = nextFibonacci;
        }
        return currentFibonacci;
    }
}