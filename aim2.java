/*
 * Given the sides of a triangle, write a program to check whether the
 * triangleis equilateral, isosceles or scalene and find its area
 */

import java.util.Scanner;

class TrinagleFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side C: ");
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            String triangleType = findTriangleType(a, b, c);
            double area = triangleArea(a, b, c);

            System.out.println("This is a " + triangleType + " triangle.");
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid triangle. The sum of any two sides must be greater than the third side.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String findTriangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}