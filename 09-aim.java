// Write a Java Program to remove all vowels from a string.

import java.util.Scanner;

 class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String stringWithoutVowels = inputString.replaceAll("[AEIOUaeiou]", "");

        System.out.println("String without vowels: " + stringWithoutVowels);

        scanner.close();
    }
}
