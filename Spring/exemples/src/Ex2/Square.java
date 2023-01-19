package Ex2;

public class Square implements shape{
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double side;
    @Override
    public double calculiArea() {
        return side*side;
    }

}
