package Day_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandeling {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("sample.txt");

            //Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content
            FileWriter writer = new FileWriter(file);
            writer.write("Hello everyon i Hope you all are good \nhave your food and bunck the class today in the Afternoon");
            writer.close();


            // read content
            FileReader reader = new FileReader(file);

            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
