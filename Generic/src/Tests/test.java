package Tests;

public class test {
    public static void main(String[] args) {
        GeniricC<Dog> a = new GeniricC<>(new Dog("dog"));
        a.eatAgain();

        GeniricC<Cat>  b = new GeniricC<>(new Cat("cat"));
        b.eatAgain();
    }
}
