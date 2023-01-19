package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Somme s1 = new Somme(9, 12);
        Somme s2 = new Somme(9, 3);

        FutureTask ft1 = new FutureTask<>(s1);
        FutureTask ft2 = new FutureTask<>(s2);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.start();
        t2.start();

        int v1 = (int)ft1.get();
        int v2 = (int)ft2.get();

        System.out.println(" value of first item : "+v1);
        System.out.println(" value of second  item : "+v2);
    }


}
