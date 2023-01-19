import java.net.InetAddress;
import java.net.UnknownHostException;

public class exemple1 {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByAddress(new byte[]{(byte) 142, (byte)250, (byte)184 , (byte) 164});
            //InetAddress inet = InetAddress.getByName("www.google.com");

            System.out.println("IP : "+ inet.getHostAddress());
            System.out.println("Name : "+ inet.getHostName());
        } catch (UnknownHostException e) {
           e.printStackTrace();
        }
    }
}
//TODO :