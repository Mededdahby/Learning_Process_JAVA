package Somme_EntNAt;

import Declanch_Error.ErrConst;

public class EntNat {
    private int x;
    public EntNat(int x) throws ErrConst {
        if(x ==0 ) throw new ErrConst("Object doesn't been created due to negative value of :"+ x + " !.");
    }

    public EntNat(){

    }
    public void setN(int n){this.x=n;}

    public int getN(){return this.x;}

    public static EntNat Somme(EntNat n1 , EntNat n2) throws ErrSomme{
        EntNat n3 = new EntNat();
        n3.setN(n1.getN()+ n2.getN());
        if(n3.getN() > Integer.MAX_VALUE || n3.getN()<=0 )   throw  new ErrSomme("this Operation should not been done!");
        return  n3;
    }

    public static EntNat Produit(EntNat n1 , EntNat n2) throws ErrProduit{
        EntNat n3 = new EntNat();
        n3.setN(n1.getN()* n2.getN());
        if(n3.getN() > Integer.MAX_VALUE || n3.getN()<=0)   throw  new ErrProduit("this Operation should not been done!");
        return  n3;
    }
    
    public static EntNat Diff(EntNat n1 , EntNat n2) throws ErrDiff{
        EntNat n3 = new EntNat();
        n3.setN(n1.getN()- n2.getN());
        if(n3.getN()<=0)   throw  new ErrDiff("this value is going to negative way!");
        return  n3;
    }

}