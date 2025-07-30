package Day_3;

import java.io.File;
import java.util.Date;

public class Files_and_filelist {
    public static void main(String[] args){
        File file= new File("C:\\Users\\admin");
        String[] fileLis= file.list();
        for (String i:fileLis){
            System.out.println(i);
        }
    }
}
