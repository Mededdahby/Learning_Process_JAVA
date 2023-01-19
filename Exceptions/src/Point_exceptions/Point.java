package Point_exceptions;

import Declanch_Error.ErrConst;

public class Point {
    private  int x,y;
    public  Point (int x, int y) throws ErrConst{
        if(x<=0 || y<=0) throw new ErrConst( x +" ou "+ y +" est null o negative");
        this.x = x;
        this.y=y;
    }
    public String ToString(){
        return "thse are my point postoins"+x +" "+y;
    }
}
