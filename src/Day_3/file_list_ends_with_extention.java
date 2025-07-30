package Day_3;


import java.io.File;
import java.io.FilenameFilter;

public class file_list_ends_with_extention {

    public static void main(String a[]) {
        File file = new File("C:\\Users\\admin\\PycharmProjects\\MyWeb");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".py")) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        for (String f : list) {
            System.out.println(f);
        }
    }
}