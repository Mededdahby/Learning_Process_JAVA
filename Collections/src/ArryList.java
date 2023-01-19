import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Test1");
        myList.add("Test2");
        myList.add("Test3");
        myList.add("Test4");
        myList.add("Test5");
        Iterator it = myList.iterator();

        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
       // if(str.equals("test2")) it.remove();

    }
}
