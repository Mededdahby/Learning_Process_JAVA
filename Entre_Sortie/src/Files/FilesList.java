package Files;

import java.io.File;

public class FilesList {
    public static void main(String[] args) {
        File file = new File("C:/Users/Med-0X/Desktop/Courses");
        String[] fileList = file.list();
        file.mkdir();
        for(String a : fileList){
            if(file.isDirectory())
                System.out.println(a);
        }
    }
}
