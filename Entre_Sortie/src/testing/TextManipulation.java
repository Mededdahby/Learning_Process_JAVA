package testing;

import java.io.*;
import java.util.Scanner;

public class TextManipulation {
    public void writeText(String fileName){
        Scanner sc = new Scanner(System.in);
        try {
            PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            System.out.println("give a text : ");
            String data =  sc.nextLine();
            pr.println(data);
            pr.flush();
            pr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readText(String fileName){
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            System.out.println("give a text : ");
          String info=  br.readLine();
            System.out.println(info);
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
