package Declanch_Error;
import Declanch_Error.EntNat;
import Declanch_Error.ErrConst;
public class Main {
    public static void main(String[] args) {
        try{
      EntNat entier = new EntNat(-12);
        System.out.println( "the number is : " +entier.getN());
        }
        catch (ErrConst e){
            System.out.println(e.getMessage());
        }
    }
}