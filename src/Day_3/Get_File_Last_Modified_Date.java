package Day_3;


import java.io.File;
import java.util.Date;

public class Get_File_Last_Modified_Date {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\IdeaProjects\\wipro_talent_next\\sample.txt");
        Date date=new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }
}
