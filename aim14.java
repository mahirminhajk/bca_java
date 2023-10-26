// Write a java program to find the volume of cube, rectangular box, cylinder using function overloading.

class VolumeCalculator {
    // Calculate volume of a cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Calculate volume of a rectangular box
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Calculate volume of a cylinder
    double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // Calculate and display the volume of a cube
        double cubeVolume = calculator.calculateVolume(5.0);
        System.out.println("Volume of the cube: " + cubeVolume);

        // Calculate and display the volume of a rectangular box
        double boxVolume = calculator.calculateVolume(4.0, 6.0, 8.0);
        System.out.println("Volume of the rectangular box: " + boxVolume);

        // Calculate and display the volume of a cylinder
        double cylinderVolume = calculator.calculateVolume(3.0, 5.0);
        System.out.println("Volume of the cylinder: " + cylinderVolume);
    }
}