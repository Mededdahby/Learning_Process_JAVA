public abstract  class  Information {
public static String className ="test";
    public int age ;
    public  String name;
    public String job ;

    public Information(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
        className = "Info";
    }

    public abstract void getKnown();
}
