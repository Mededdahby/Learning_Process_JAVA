public class Calcul1M extends Thread {
    public int val =1;
    public int sum;
    public int max;

    public Calcul1M(int vl, int max) {
        val = vl;
        this.max = max;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i =  val; i <= max; i++) {
                sum += i;
        }
    }
}
