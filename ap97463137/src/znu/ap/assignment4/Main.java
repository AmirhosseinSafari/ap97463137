package assignment4;
import java.util.*;

public class Main {             //created by Amirhossein Safari

    public static void main(String[] args) {

        System.out.println("This program can sort your array in special way!");
        System.out.println("Please enter length of rows and columns of array:");
        Scanner input = new Scanner(System.in);
        System.out.print("Row: ");
        int a = input.nextInt();
        System.out.print("Column: ");
        int b = input.nextInt();

        int A [][] = new int[a][b];

        Random rnd = new Random();

        System.out.println("Primery Array:");
        for(int i = 0; i<a ; i++){
            for(int j = 0; j<b ; j++){
                A[i][j] = rnd.nextInt(99) + 1;
                System.out.format("%d\t",A[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("Please enter row or column that you want to array be sorted in that:\n(r = row , c = column)");
        String c = input.next();
        if(c.equals("r")) {
            System.out.print("Please enter the number of row: ");
        }else {
            System.out.print("Please enter the number of column: ");
        }
        int d = input.nextInt();

        if( c.equals("r")) {

            int temp;
            boolean flage = false;
            for(int r = 0; r<b ; r++){

                for(int i = 0; i<b-1 ;i++){
                    if(A[d][i] > A[d][i+1]){
                        flage = true;
                        for(int j = 0; j<a ; j++){
                        temp = A[j][i+1];
                        A[j][i+1] = A[j][i];
                        A[j][i] = temp;
                        
                        }
                    }
                }
                if(flage == false){break;}
            }

            System.out.println("Secondary Array:");
            for(int i = 0; i<a ; i++){
                for(int j = 0; j<b ; j++){
                    System.out.format("%d\t",A[i][j]);
                }
                System.out.print("\n");
            }

        }else if(c.equals("c")){

           int temp;
           boolean flage = false;
        for(int r = 0; r<a ; r++) {

            for (int i = 0; i < a-1; i++) {

                if (A[i][d] > A[i + 1][d]) {
                    flage = true;
                    for (int j = 0; j < b; j++) {
                        temp = A[i + 1][j];
                        A[i + 1][j] = A[i][j];
                        A[i][j] = temp;
                    }
                }
            }
            if(flage == false) {break;}
            }//end of big for

            for(int i = 0; i<a ; i++){
                for(int j = 0; j<b ; j++){
                    System.out.format("%d\t",A[i][j]);
                }
                System.out.print("\n");
            }

        }else{
            System.out.println("Wrong Input!\nYour number should be smaller than (your row/column number) - 1");
        }

        System.out.println("Enter any key to Exit ...");
        try{
            System.in.read();
        }catch(Exception  e){}

    }
}
