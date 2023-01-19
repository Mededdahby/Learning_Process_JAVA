package Point_exceptions;

import Declanch_Error.ErrConst;

public class Main {
    public static  void main(String[] args) {

        try {

            Point p = new Point(12, 3);

            System.out.println(p.ToString()); }
     catch (ErrConst e) {
            System.out.println(e.getMessage());
        }
    }
}
