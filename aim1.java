
// Java Programming Code to Find HCF LCM of Two Numbers.
import java.util.Scanner;

class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        int hcf = findHCF(a, b);
        int lcm = findLCM(a, b);

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        sc.close();
    }

    // Method to find the HCF (GCD) using Euclidean Algorithm
    public static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }

    // Method to find the LCM using the HCF
    public static int findLCM(int a, int b) {
        int hcf = findHCF(a, b);
        return (a * b) / hcf;
    }

}

/*
 * class diagram
 * Find
 * - main(String[ ] args)
 * - findHCF(int a, int b): int
 * - findLCF(int a, int b): int
 */
