public class Genric<T1 , T2>{
    private int id ;
    private T1  val1 ;
    private T2 val2;

    public static int number ;
    public Genric(T1 val1 , T2 val2  ,int id){
        this.val1 =val1;
        this.val2= val2;
        this.id = id;
        number++;
    }
    public T1 getVal1(){
        return this.val1;
    }
    public T2 getVal2(){
        return this.val2;
    }
    public  void setVal1( T1 val1){
        this.val1 = val1;
    }
    public void setVal2( T2 val){
        this.val2  =val;
    }

    public  String ToString( T1 value){
        return "this is a value of : " + value;
    }
}
