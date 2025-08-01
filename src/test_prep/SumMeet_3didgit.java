package test_prep;

import java.util.*;
import java.util.Collections;

public class SumMeet_3didgit {
    public static void main(String[] args){
        int N=1;
        Scanner sc= new Scanner(System.in);
        List<Integer> arr =new ArrayList<>();
        while(N<=5){
            System.out.print("Enter the input"+N);
            int num = sc.nextInt();

            // Convert number to digits and sort
            char[] digits = String.valueOf(num).toCharArray();

            Arrays.sort(digits);
            StringBuilder st= new StringBuilder();
            for(int i=0; i<digits.length; i++){
                System.out.println(digits[i]);
                if(i<3)
                    st.append(digits[i]);
            }
            int temp = Integer.parseInt(String.valueOf(st));
            arr.add(temp);
            N++;

        }
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        System.out.println(sum);

    }
}


