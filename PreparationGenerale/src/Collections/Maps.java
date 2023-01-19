package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
    public void maps(){
       HashMap<Integer , String> np = new HashMap<Integer ,String>();
       np.put(1 , "First");
       np.put(2 , "second");
       np.put(3, "third");
        System.out.println(np.values());
        System.out.println(np.entrySet());
Set<Map.Entry<Integer, String>> setEntry = np.entrySet();
        Iterator<Map.Entry<Integer ,String >> it = setEntry.iterator();
while (it.hasNext()){
    System.out.println(it.next().getValue());
}

    }

    public static void main(String[] args) {
        Maps mp = new Maps();
        mp.maps();
    }
}
