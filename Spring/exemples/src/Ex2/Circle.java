package Ex2;

public class Circle implements shape{
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculiArea() {
        return Math.PI*radius*radius;
    }
}
