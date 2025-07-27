package day_1;

import java.util.Scanner;


public class LargestNumberUsingSwitchCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        switch (a%2){
            case 0:{
                System.out.println("even");
                break;
            }
            case 1:{
                System.out.println("odd");
                break;
            }
            default:{
                System.out.println("The Invalid Input");
            }

        }
    }
}
