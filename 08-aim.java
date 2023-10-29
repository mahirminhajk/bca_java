/* 
    Write a Java Programming Code to Check given string is Anagram or Not.
    If the two strings are anagram to each other, then one string can be rearranged 
    to form the other string. For Example: abc and cba are anagram string.
*/ 



import java.util.Arrays;
import java.util.Scanner;

class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        // Remove spaces and convert the strings to character arrays
        char[] charArray1 = str1.replaceAll("\\s", "").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toCharArray();

        // Check if the lengths of the character arrays are equal
        if (charArray1.length != charArray2.length) {
            System.out.println("The two strings are not anagrams.");
            return;
        }

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }
}
