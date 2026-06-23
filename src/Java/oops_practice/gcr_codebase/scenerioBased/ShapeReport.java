package Java.oops_practice.gcr_codebase.scenerioBased;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }

    double perimeter() {
        return 0;
    }
}

public class ShapeReport {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        };

        System.out.println("Shape\t\tArea");

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + "\t" + s.area());
        }
    }
}