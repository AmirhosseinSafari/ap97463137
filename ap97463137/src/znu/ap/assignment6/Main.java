package assignment6;

import java.util.*;

public class Main {

    public static void main(String[] args) {                //created by Amirhossein Safari

    System.out.println("This program will create an arraylist with random number of rows,columns and values.");
    System.out.print("Please follow the orders...\nPlease enter a number: ");

	Scanner input = new Scanner(System.in); //daryafte vorodi
	int x = input.nextInt();

	ArrayList<ArrayList<Integer>> myArraylist = new ArrayList<ArrayList<Integer>>();  //ejade arraylist do bo'di

    Random rand = new Random();  //ejade adade random
	int rndRow = rand.nextInt(x);

	ArrayList<Integer> row;     //ejade satr

    int rndcol [] = new int[x];
    /*for(int i = 0 ; i<rndRow ; i++){  //ejade araye baraye gharar dadane majmoo
        rndcol[i] = -1;
    }*/

	for(int i =0; i<rndRow ; i++) {
	    rndcol[i] = rand.nextInt(x);       //ejade soton
	    row = new ArrayList<Integer>(rndcol[i]);

	    for(int j = 0; j<rndcol[i] ;j++){  //meghdar dehi
            row.add(rand.nextInt(x));
        }

        myArraylist.add(row);  //ezafe kardan be array asli
    }

        for (int i=0; i<myArraylist.size();i++) {  //chape array
            System.out.println(myArraylist.get(i));
        }

        float p [] = new float[rndRow];
        for(int i = 0 ; i<rndRow ; i++){  //ejade araye baraye gharar dadane majmoo/miyangin
            p[i] = -1;
        }

        int j;
        for(int i = 0; i<rndRow ; i++) {  //mohasebe majmo va miyangin
            for( j= 0 ; j<rndcol[i] ; j++) {
                p[i] += myArraylist.get(i).get(j);
            }

            if(rndcol[i] != 0){    //check kardane sefr nabodane tedade a'zaye satr
                p[i]++;
                p[i] = (p[i]/j);    // miyangin
                }

        }

        if(rndRow != 0) {            //ckeck kardane sefr nabodane tole satr ha
            for (int i = 0; i < rndRow; i++) {
                if(rndcol[i] != 0) {             //check kardane sefr nabodane tedade a'zaye satr
                    System.out.format("avrege of row[%d] = %f\n", i, p[i]);
                }
                else {
                    System.out.println("this row is empty!");
                }
            }
            float max = -1;
            float min = x;
            for(int i = 0; i<rndRow ;i++){
                if(max < p[i]){
                    max = p[i];
                }
                if(min > p[i]){
                    min = p[i];
                }
            }

            if(max != -1) {
                System.out.format("max = %f\n", max);
            }
            else {
                System.out.println("max = null");
                }
            if(min != -1) {
                System.out.format("min = %f\n", min);
            }
            else{
                System.out.format("min = null");
            }


        }
        else{
            System.out.println("arraylist is empty!");
        }

        System.out.println("\nEnter any key to finish...");
        try {
            System.in.read();
        }catch (Exception e){
        }

    }
}
