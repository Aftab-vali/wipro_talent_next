package project;



import java.util.Scanner;

public class ALTERNATE_ADD_SUM {
    public static int AddSub(int N, int opt) {
        int res = N;
        if (opt == 2) {
            while (N > 0) {
                if (N % 2 == 0) {
                    res += N;

                } else {
                    res -= N;
                }
                N--;
            }

        } else {
            while (N > 0) {
                if (N % 2 == 0) {
                    res -= N;

                } else {
                    res += N;
                }
                N--;
            }

        }

        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int N= sc.nextInt();
        int opt= sc.nextInt();
        int out= AddSub(N,opt);
        System.out.println(out);

    }
}



