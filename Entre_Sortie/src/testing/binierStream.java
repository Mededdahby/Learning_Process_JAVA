package testing;

import java.io.*;
import java.util.Scanner;

public class binierStream {
    public void reaData(String fileName) throws FileNotFoundException {
        try{
            DataInputStream dti = new DataInputStream( new FileInputStream(fileName));
            int data = dti.readInt();
            boolean empty = true;
                System.out.println(data);
                dti.close();
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void writeData(String fileName){
        Scanner sc = new Scanner(System.in);
        try {
            DataOutputStream dto = new DataOutputStream( new BufferedOutputStream(new FileOutputStream(fileName)));
            System.out.println("give a number : ");
            int data = sc.nextInt();
            sc.nextLine();

            dto.writeInt(data);
            System.out.println("done !");
            dto.close();


        }catch (IOException e){

        }finally {

        }
    }
}
