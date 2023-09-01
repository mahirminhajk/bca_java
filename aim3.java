/*
 * 3. Read an array of 10 or more numbers and write a program to find the
 * a) Smallest element in the array
 * b) Largest element in the array
 * c) Second largest element in the array
 */

import java.util.Scanner;

class ArrayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sm = findSM(a);
        int la = findLA(a);
        int seLa = findSeLa(a);

        System.out.println("Smallest element in the array: " + sm);
        System.out.println("Largest element in the array: " + la);
        System.out.println("Second largest element in the array: " + seLa);

        sc.close();
    }

    public static int findSM(int[] a) {
        int sm = a[0];
        for (int num : a) {
            if (num < sm) {
                sm = num;
            }
        }
        return sm;
    }

    public static int findLA(int[] a) {
        int la = a[0];
        for (int num : a) {
            if (num > la) {
                la = num;
            }
        }
        return la;
    }

    public static int findSeLa(int[] a) {
        int la = a[0];
        int seLa = a[0];

        for (int num : a) {
            if (num > la) {
                seLa = la;
                la = num;
            } else if (num > seLa && num != la) {
                seLa = num;
            }
        }

        return seLa;
    }

}

/*
 * class diagram
 * ArrayFinder
 * - main(String[ ] args)
 * - findSM(int[ ] a): int
 * - findLA(int[ ] a): int
 * - findSeLa(int[ ] a): int
 */
