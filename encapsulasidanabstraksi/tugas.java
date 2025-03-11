package encapsulasidanabstraksi;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

}

class Traingle extends Shape {
    private float base;
    private float height;

    public Traingle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class tugas {
    public static void main(String[] args) {
        Shape triangle = new Traingle("Merah", 10, 5);
        Shape circle = new Circle("Hijau", 5);

        System.out.println("Luas Segitiga: " + triangle.getArea());
        System.out.println("Luas Lingkaran: " + circle.getArea());
    }

}