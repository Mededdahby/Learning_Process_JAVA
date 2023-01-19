package Tests;

public class Dog implements Animal{
    public String name ;
    public Dog(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name+" eating meat ");
    }
    public  void sound(){
        System.out.println("How how ...!");
    }

    @Override
    public void affiche() {
        System.out.println(name);
    }
}
