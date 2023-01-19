import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {

        try {
            Socket  s=  new Socket("localhost",  1262);
            System.out.println("demande de connexion ");
            BufferedReader  in = new BufferedReader((new InputStreamReader(s.getInputStream())));
            String data_recived = in.readLine();
            System.out.println(data_recived);

            s.close();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}