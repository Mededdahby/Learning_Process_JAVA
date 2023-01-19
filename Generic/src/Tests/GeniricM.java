package Tests;

public class GeniricM {

    public static <T extends Animal, V extends Animal> void info(V v, T t){
        v.eat();
        t.eat();
    }
    public static void main(String[] args) {
        info(new Cat("sana"), new Dog("alex"));
    }
}
