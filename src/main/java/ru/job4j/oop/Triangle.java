package ru.job4j.oop;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double ac = second.distance(third);
        double bc = third.distance(first);

        if (this.exist(ab, ac, bc)) {
            double sp = semiPerimeter(ab, ac, bc);
            result = Math.sqrt(sp * (sp - ab) * (sp - ac) * (sp - bc));
        }

        return result;
    }
}
