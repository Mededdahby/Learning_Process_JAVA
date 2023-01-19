import java.awt.Color;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        //Color should be created before use it because it's a class
        Color c = new Color(21, 38, 37);
        Color c2 = new Color(21, 255, 37);

        //Create a Point and Call affiche() Function:
        Point point = new Point( 12 ,1);
        point.affiche();

        //Create a PointGraphic
        PointGraphic poinyGraphic = new PointGraphic();
        poinyGraphic.setX(12);
        poinyGraphic.setY(15);
        poinyGraphic.c =c;
        poinyGraphic.affiche();
       //Subclasses
        //we can use Point Class to create new object of PointGraphic
        Point poinyGraphic2 = new PointGraphic();
        poinyGraphic.setX(1);
        poinyGraphic.setY(13);
        //we have to clarify that this attribute belong to Graphic object not normal point :
        ((PointGraphic) poinyGraphic2).c =c2;
      poinyGraphic2.affiche();
    }
}