import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
       try {
           ServerSocket ecout = new ServerSocket(1262, 1);
           System.out.println("le servveur est à l'écoute du port "+ ecout.getLocalPort());
           Socket server = null;
           while (true){
               server = ecout.accept();
               System.out.println("user est connecté : ");
               PrintWriter pn = new PrintWriter(server.getOutputStream());
               pn.println("hello from server ");
               pn.flush();
               System.out.println("data est envoyer: ");
               break;
           }
           System.out.println("connecxion est términé");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}