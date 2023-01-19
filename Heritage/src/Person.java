public class Person extends Information{

    public Person( int age , String name  , String job){
       super(age , name , job);
    }

    @Override
    public void getKnown() {
        System.out.println("hello my name is "+ this.name + " I'm working on "+ this.job);
    }
}

