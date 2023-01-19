package Exceptions;

public class MyException extends Exception{
    public MyException(String name){
        super("my exception has been called ... !"+ name);
    }
}
