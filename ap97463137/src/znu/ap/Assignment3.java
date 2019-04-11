package assignment3;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program can fill a bidimensional Array's tables with random numbers");
        System.out.println("and show it in special form!\nPlease follow the orders.");
        System.out.print("Please Enter your number:");

        Scanner input = new Scanner(System.in);     //#1
        int n = input.nextInt();

        int A[][] = new int[n][n];      //#2

        Random rand = new Random();

        for(int i=0; i<n ; i++){        //#3
            for(int j=0; j<n ;j++){
                A[i][j] = rand.nextInt(99)+1;
            }
        }

        for(int i=0; i<n ;i++){
            for(int j=0; j<n ;j++){
                System.out.format("%d\t",A[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("\n\n");


        int line = 1;       //#4
        int q,w = 0;
        for(int i=0; i<n ;i++){
            q = line;
            for(int j=0; j<line ;j++){
                System.out.format("%d\t",A[w][q - 1]);
                q--;
                w++;
            }
            w = 0;
            line ++;
        }

        line = n-1;
        w = 1;
        q = n-1;
        for(int i=0; i<n-1 ;i++){
            for(int j=0; j<line ;j++){
                System.out.format("%d\t",A[w][q]);
                w++;
                q--;
            }
            w = i + 2;
            q = n-1;
            line--;
        }

        try{
            System.in.read();
        }
        catch(Exception ex){}
    }
}
