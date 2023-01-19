package ClientSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

        public static void main(String[] args) {

            try {
                Socket s=  new Socket("localhost",  1222);
                System.out.println("demande de connexion ");
                BufferedReader in = new BufferedReader((new InputStreamReader(s.getInputStream())));
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

