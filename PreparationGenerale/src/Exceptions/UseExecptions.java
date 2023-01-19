package Exceptions;

public class UseExecptions {
    public void Calcul(int a , int b){
        try{
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("fin de code... !");
        }
    }

    public static void main(String[] args) {
        UseExecptions n = new UseExecptions();
        n.Calcul(12, 0);
    }
}
