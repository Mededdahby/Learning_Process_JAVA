package Somme_EntNAt;


public class Main {

    public static void main(String[] args) {
        try {
            EntNat n = new EntNat();
            n.setN(129020002);
            EntNat n2 = new EntNat();
            n2.setN(123893);
            EntNat n3 = new EntNat();
            //Somme
            n3 = EntNat.Somme(n, n2);
            System.out.println( "La somme est : " +n3.getN());
            //Produit
            n3 = EntNat.Produit(n, n2);
            System.out.println( "le produit est :"+ n3.getN());
            //Diff
            n3 = EntNat.Diff(n, n2);
            System.out.println( "Diff est : "+n3.getN());

        } catch (ErrSomme ignored) {
            System.out.println(ignored.getMessage());
        } catch (ErrProduit e) {
            System.out.println(e.getMessage());
        } catch ( ErrDiff ee) {
        System.out.println(ee.getMessage());
    }
    }
}
