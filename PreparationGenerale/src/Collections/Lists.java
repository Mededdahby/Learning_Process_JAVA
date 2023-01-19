package Collections;

import java.util.*;

public class Lists {
    public void arryList( int a , int b , int c ){
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int n = it.next();
            System.out.print(n + "\t");
        }
        System.out.println();
    }
    public void lickedList( int a , int b , int c){
        List<Integer> linked = new LinkedList<>();
        linked.add(a);
        linked.add(b);
        linked.add(c);
        Iterator<Integer> it = linked.iterator();
        linked.sort(Comparator.comparing(e -> e>0 ? 1:0));
        while (it.hasNext()){
            System.out.print(it.next()+ "\t");
        }
        System.out.println();
    }
    public void victor( int a , int b , int c){
        List<Integer> linked = new Vector<>();
        linked.add(a);
        linked.add(b);
        linked.add(c);
        Iterator<Integer> it = linked.iterator();
        while (it.hasNext()){
            System.out.print( it.next()+ "\t");
        }

    }
    public void stack( int a , int b , int c){
        List<Integer> linked = new Stack<>();
        linked.add(a);
        linked.add(b);
        linked.add(c);
        Iterator<Integer> it = linked.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ "\t");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Lists ls = new Lists();
        ls.arryList(-3,1,0);
        ls.lickedList(11, 2,0);
        ls.stack(12 ,3 ,12);
        ls.victor(12 ,3 ,12);
    }
}
