//pdf


import java.util.Scanner;

class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Perform base conversions
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexadecimal = Integer.toHexString(num);

        // Display the results
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        scanner.close();
    }
}