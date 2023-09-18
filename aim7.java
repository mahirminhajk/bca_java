// 7.Write java program to find the sum of the digits and reverse of a given number.
// (using class and objects)
import java.util.Scanner;

class NumberOperations {
    private int no;

    public NumberOperations(int no) {
        this.no = no;
    }

    public int reverseNumber() {
        int reversed = 0;
        int original = no;

        while (original != 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        return reversed;
    }

    public int sumOfDigits() {
        int sum = 0;
        int original = no;

        while (original != 0) {
            int digit = original % 10;
            sum += digit;
            original /= 10;
        }

        return sum;
    }
}

class NumberManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Create an object of NumberOperations class
        NumberOperations numberObj = new NumberOperations(num);

        // Calculate and display the sum of digits
        int sum = numberObj.sumOfDigits();
        System.out.println("Sum of digits: " + sum);

        // Calculate and display the reverse of the number
        int reversed = numberObj.reverseNumber();
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
