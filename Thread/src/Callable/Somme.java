package Callable;

import java.util.concurrent.Callable;
public class Somme implements Callable<Integer> {
    public int val1 ;
    public int val2;
    public Somme(int v1 , int v2){
        val1=v1;
        val2= v2;
    }
    @Override
    public Integer call() throws Exception {
        Integer sum = val1+val2;
        return sum;
    }
}
