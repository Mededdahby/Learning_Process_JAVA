import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket socketEcoute = new ServerSocket(1222);
        while(true) {
            Socket socketConnexion = socketEcoute.accept();
            Connexion con = new Connexion(socketConnexion);
            Thread processus_connexion = new Thread(con);
            processus_connexion .start();
        }
    }
}