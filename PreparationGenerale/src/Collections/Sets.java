package Collections;

import java.util.*;

public class Sets {
    public void treeSet( int a , int b , int c ){
        Set<Integer>  set = new TreeSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
public void linkedHashSet(int a, int b , int c){
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(a);
        lhs.add(b);
        lhs.add(c);
    System.out.println(lhs);
}
    public static void main(String[] args) {
        Sets st = new Sets();
        st.treeSet(13,13,203);
        st.linkedHashSet(-3,13,203);
    }
}
