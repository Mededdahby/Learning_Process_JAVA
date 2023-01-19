package Sérialisation;

import java.io.Serializable;

public class Person implements Serializable {
    private String name ;
    transient private int   age ;
    public Person(String n , int age){
        name = n ;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String ToString(){
        return "Hello my name is : "+name + " and I'm " +age+ " years old";
    }
}
