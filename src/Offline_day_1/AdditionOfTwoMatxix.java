package Offline_day_1;

public class AdditionOfTwoMatxix {
    public static void main(String[] args){
        int[][] A={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] B={
                {5,67,7},
                {5,75,6},
                {56,7,9}
        };

        int [][] out=new int[A.length][A[0].length];

        for (int i=0; i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                out[i][j]=A[i][j]+B[i][j];
            }
        }

        for (int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(out[i][j]+" ");
            }
        }



    }


}
