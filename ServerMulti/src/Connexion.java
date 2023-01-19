import java.io.*;
import java.net.Socket;

public class Connexion implements Runnable {
    BufferedReader in;
    PrintWriter pr;
    Socket socket;

    public Connexion(Socket cible) throws IOException {
        this.socket=cible;
        in= new BufferedReader(new
                InputStreamReader(cible.getInputStream()));
        pr = new PrintWriter(cible.getOutputStream());
    }
    @Override
    public void run() {
        while (true){
            String ligne = null;
            try {
                ligne = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if ( ligne == null) break;
            pr.println(ligne);
            pr.flush();
        }
    }
}
