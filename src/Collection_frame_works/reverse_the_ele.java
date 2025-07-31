package Collection_frame_works;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse_the_ele {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("Orange");
        list1.add("White");
        list1.add("Black");
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

    }
}
