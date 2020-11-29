abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}


class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}


class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}


class Rectangle extends Shape {
    private final double length;
    private final double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }


    @Override
    double getPerimeter() {
        return 2 * (length + breath);
    }

    @Override
    double getArea() {
        return length * breath;
    }
}