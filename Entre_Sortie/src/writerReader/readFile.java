package writerReader;

import java.io.*;
import java.util.StringTokenizer;

public class readFile {
    public static void main(String[] args) throws IOException {
        StringTokenizer stk = new StringTokenizer("writer.txt");
        File newFile = new File("writer.txt");
        String line ="";
        BufferedReader readfile = new BufferedReader( new FileReader(newFile));
        do{
            line = readfile.readLine();
            if(line != null){
                System.out.println(line);
            }
        }while(line != null);
        System.out.println("DOnne !!!");
    }
}
