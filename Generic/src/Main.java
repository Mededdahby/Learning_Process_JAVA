import Tests.Animal;
import Tests.Cat;
import Tests.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* solo<Integer > SoloI = new solo<Integer>(12);
        solo<String > SoloS = new solo<String>("this is a string value ");
        solo<Float > SoloF = new solo<Float>(12F);
        solo<Double > SoloID = new solo<Double>();

        System.out.println(SoloS.getValeur());
        System.out.println(SoloF.getValeur());


        Genric<Integer , Float> first = new Genric<Integer , Float>(12 , 13F , 1);*/

        collections c = new collections();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("dog1"));
        animals.add(new Dog("dog1"));
        animals.add(new Cat("cat1"));
        animals.add(new Cat("cat1"));
        c.affiche(animals);
    }
}
