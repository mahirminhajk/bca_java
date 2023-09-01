//Write a program to merge two arrays.

import java.util.Arrays;
import java.util.Scanner;

class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int l1 = sc.nextInt();
        int[] a1 = new int[l1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < l1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int l2 = sc.nextInt();
        int[] a2 = new int[l2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < l2; i++) {
            a2[i] = sc.nextInt();
        }

        int[] ma = new int[l1 + l2];
        System.arraycopy(a1, 0, ma, 0, l1);
        System.arraycopy(a2, 0, ma, l1, l2);

        System.out.println("Merged Array: " + Arrays.toString(ma));

        sc.close();
    }
}

/*
 * class diagram
 * MergeArrays
 * - main(String[ ] args)
 */
