import java.awt.*;

public class PointGraphic extends Point{
    Color c;
    public PointGraphic(int x, int y, Color c) {
        super(x, y);
        this.c = c;
    }
    public PointGraphic(){
        super();
    }
    @Override
    public int distanceFromOrigin() {
        return super.distanceFromOrigin();
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("I have a color "+this.c);
    }
}
