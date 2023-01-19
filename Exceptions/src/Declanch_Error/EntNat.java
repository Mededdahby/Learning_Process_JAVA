package Declanch_Error;
public class EntNat {
    private int x;
    public EntNat(int x) throws ErrConst {
        if(x < 0 ) throw new ErrConst("there is an error!");
        else this.x =x;
    }
    public int getN(){
        return this.x;
    }
}
