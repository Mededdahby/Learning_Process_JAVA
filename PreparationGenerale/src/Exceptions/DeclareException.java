package Exceptions;

public class DeclareException {
    public void Calcul(int a , int b) throws Exception{
            int c = a/b;
            System.out.println(c);
    }

    public static void main(String[] args) {
        DeclareException n = new DeclareException();
        try {
            n.Calcul(12, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
