package Exceptions;

public class CreateException {
    public void DoSomething( int a , int b ) throws MyException{
        if(a<=0 || b <=0 ) throw new MyException( "data");
      int c = a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        CreateException cr = new CreateException();
        try {
            cr.DoSomething(12 ,0);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
