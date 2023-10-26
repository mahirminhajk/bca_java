// Write a program to count and display total number of objects created to a class. (Hint: static members).

class MyClass {
    // Static variable to keep track of the number of objects created
    static int count = 0;

    MyClass() {
        // Constructor: Increment the count when an object is created
        count++;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Display the total number of objects created
        System.out.println("Total number of objects created: " + MyClass.count);
    }
}