public class hello {
    public static void main(String[] args) {
        System.out.println(Information.className);
        Information[] e = new Information[3];
        e[0] = new Person(32, "Ahmed" , "driver");
        e[1]= new Employer(26, "Mohamed" , "prof","Google" , "Manager" , 12345);
        e[2] = new Person(22, "Med" , "developer");

        for (var a : e) {
            a.getKnown();
        }
        System.out.println(Information.className);

    }
}