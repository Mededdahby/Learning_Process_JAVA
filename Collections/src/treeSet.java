import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {

       /* Set<String> tree = new TreeSet<>();
        tree.add("Nadia");
        tree.add("Mohamed");
        tree.add("Alli");
        tree.add("Alli");
        tree.add("Bahim");
        Iterator<String> i = tree.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }*/


        Set<Person> tree1 = new TreeSet<Person>();

        Person p0 = new Person(1 , "alex", 12);
        Person p1= new Person(2 , "hamid" , 20);
        Person p2 = new Person(3, "khalid", 30);


        tree1.add(p0);
        tree1.add(p1);
        tree1.add(p2);

        Iterator<Person> it = tree1.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
