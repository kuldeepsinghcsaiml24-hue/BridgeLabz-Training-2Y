class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    double circ() {
        return 2 * Math.PI * r;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circ());
    }
}
