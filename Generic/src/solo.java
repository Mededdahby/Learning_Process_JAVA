import java.util.List;

public class solo<T> {
    private T valeur;

    public solo() {
        this.valeur = null;
    }

    public solo(T val) {
        this.valeur = val;
    }

    public void setValeur(T val) {
        this.valeur = val;
    }

    public T getValeur() {
        return this.valeur;
    }

}
