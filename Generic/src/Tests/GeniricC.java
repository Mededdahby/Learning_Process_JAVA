package Tests;

public class GeniricC <V extends Animal>{
    V animal;

    public GeniricC(V animal){
        this.animal = animal;
    }

    public V getAnimal() {
        return animal;
    }
    public void eatAgain(){
        animal.eat();
    }

    public static <V extends Animal> void doSomthong(V animal){
        System.out.println("eat : ");
        animal.eat();
        System.out.println("make sound : ");
        animal.sound();
    }

}
