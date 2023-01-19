package writerReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class writeFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter writefile = new PrintWriter(new BufferedWriter( new FileWriter("writer.txt")));
        String data = "";
        do{
            System.out.println("donner un text");
            data = sc.nextLine();
            if(!data.equals("exit")){
                writefile.println(data);
            }
        }while(!data.equals("exit"));
        writefile.close();
        System.out.println("Done !");
    }
}
