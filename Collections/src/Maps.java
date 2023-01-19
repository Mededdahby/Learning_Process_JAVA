import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class Maps{

    public static void main(String[] args) {
        Map<Integer , String> map =  new HashMap<>();
        map.put(1,"un");
        map.put(2,"deux");
        map.put(3,"Trois");
        map.put(4,"quatre");
        Set<Integer> setInt = map.keySet();
        Iterator<Integer> it = setInt.iterator();
        System.out.println("pacour map");
        while(it.hasNext()){
            int key = it.next();
            System.out.println(key);
        }

    Set<Entry<Integer , String>> setEntry =map.entrySet();
        Iterator<Entry<Integer , String>>  itEntry = setEntry.iterator();
        while(itEntry.hasNext()){
            Entry<Integer , String> entry = itEntry.next();
            System.out.println(entry.getKey()  + " : " + entry.getValue());
        }

    }

}
