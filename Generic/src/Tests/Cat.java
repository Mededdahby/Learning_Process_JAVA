package Tests;

 public class Cat implements Animal{
    public String name ;
    public Cat(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name +" eating crock-its ");
    }



    public  void sound(){
        System.out.println("Meow  ...!");
    }

    @Override
    public void affiche() {
        System.out.println(name);
    }
}
