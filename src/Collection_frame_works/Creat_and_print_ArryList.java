package Collection_frame_works;


import java.util.*;

public class Creat_and_print_ArryList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);


        System.out.println("The collection to be printed are:");
        for (String i:list){
            System.out.println(i);
        }



    }
}
