// Using class and objects, write a java program to find the sum of two complex numbers.

import java.util.*;

class Complex {
    int real, imaginary;

    Complex() {

    }

    Complex(int tempReal, int tempImaginary) {
        real = tempReal;
        imaginary = tempImaginary;
    }

    Complex addComp(Complex C1, Complex C2) {
        Complex temp = new Complex();

        temp.real = C1.real + C2.real;

        temp.imaginary = C1.imaginary + C2.imaginary;

        return temp;
    }
}

public class Comp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first real part number: ");
        int a = in.nextInt();

        System.out.println("Enter the first imaginary part number: ");
        int b = in.nextInt();

        Complex C1 = new Complex(a, b);

        System.out.println("Enter the second real part number: ");
        int c = in.nextInt();

        System.out.println("Enter the second imaginary part number: ");
        int d = in.nextInt();
        Complex C2 = new Complex(c, d);

        System.out.println("Complex number 1: " + C1.real + " + " + C1.imaginary + "i");

        System.out.println("Complex number 2: " + C2.real + " + " + C2.imaginary + "i");

        Complex C3 = new Complex();

        C3 = C3.addComp(C1, C2);

        System.out.println("Sum of complex numbers: " + C3.real + " + " + C3.imaginary + "i");
    }
}