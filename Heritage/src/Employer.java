public class Employer extends Information {

    public String companyName;
    public String position ;
    public double salary;
    public Employer( int age , String name  , String job,String company , String post , int salary) {
       super(age , name ,job);
        this.companyName = company;
        this.position = post;
        this.salary = salary;
    }

    @Override
    public void getKnown() {
        System.out.println("  and I'm working for "+this.companyName+ " with the position of "+ this.position +"\n");
    }
}