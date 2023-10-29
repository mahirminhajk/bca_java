// Create an abstract class shape and create TwoDim and ThreeDim as sub classes. 
// Create classes square and triangle derived from TwoDim and sphere and cube
// derived from ThreeDim. Write a program to determinethe area of various shapes.

abstract class Shape {
    abstract double calculateArea();
}

class TwoDim extends Shape {
    @Override
    double calculateArea() {
        return 0; // Placeholder value
    }
}

class ThreeDim extends Shape {
    @Override
    double calculateArea() {
        return 0; // Placeholder value
    }
}

class Square extends TwoDim {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Triangle extends TwoDim {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Sphere extends ThreeDim {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }
}

class Cube extends ThreeDim {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(4.0, 3.0);
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(3.0);

        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Surface Area of Sphere: " + sphere.calculateArea());
        System.out.println("Surface Area of Cube: " + cube.calculateArea());
    }
}