package Collection_frame_works;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class list_copy {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("Orange");
        list1.add("White");
        list1.add("Black");


        List<String> list2 = new ArrayList<>();
        list2.add("AFTAB");
        list2.add("Abdul Sir");
        list2.add("Haroon sir");
        list2.add("latef sir");
        list2.add("Shafi sir");

        Collections.copy(list1,list2);
        System.out.println(list1);


    }
}
