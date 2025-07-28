package Offline_day_1;

import java.util.Arrays;

public class joiningOf2Array {
    public static void main(String[] args){
        int[] A={1,2,4,6,7};
        int[] B={2,3,5,67,7};
        int[] out=new int[A.length+B.length];
        int [] add=new int[A.length];
        for (int i=0;i<A.length;i++ ){
            out[i]=A[i];
        }

        for(int j=0; j<B.length;j++){
            out[A.length+j]=B[j];
        }

        System.out.print("the joined list is ");
        for(int i:out){
            System.out.print(i+" ");
        }

        System.out.println();
        for(int i=0;i<A.length;i++){
            add[i]=A[i]+B[i];

        }
        System.out.print("the added output ");
        for(int i:add){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(add);
        System.out.print("The accending order ");
        for(int i=0;i< add.length;i++){
            System.out.print(add[i]+" ");
        }
        System.out.println();
        System.out.print("The decending order ");

        for(int i=add.length-1;i>=0;i--){
            System.out.print(add[i]+" ");
        }



    }



}
