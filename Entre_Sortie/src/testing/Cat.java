package testing;

import java.io.Serializable;

public class Cat implements Serializable {
private int age ;
    private String name ;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String ToString(){
        return "{ " +name+
                " " +age+ " }";
    }
}
