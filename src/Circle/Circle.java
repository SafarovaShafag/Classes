package Circle;

public class Circle {
    private double radius;
    public static final double PI =3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getcircleArea(){
        return Math.pow(radius,2)*PI;
    }
}
