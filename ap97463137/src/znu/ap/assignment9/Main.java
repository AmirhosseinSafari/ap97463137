package assignment9;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long startTime = System.currentTimeMillis();

    static String goldenWord;
    static String adresAvaliye;


    static List<String> addressList = new ArrayList<String>();
    static List<String> nameOfFileList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your address: ");
        adresAvaliye = input.nextLine();

        System.out.print("Please enter the name of your directory:");
        goldenWord = input.next();

        System.out.print("Please enter how many layers we should search: ");
        int tedadLayeha = input.nextInt();

        List<Integer> tedadFilehaHarlevel = new ArrayList<Integer>();

        int sizeOfFirstlevel = listOfDirectories(adresAvaliye);
        int levelCounter = 0;

        for(int counter = 0 ; counter<sizeOfFirstlevel ; counter++){

            tedadFilehaHarlevel.add(    listOfDirectories(addressList.get(counter))     );
            sizeOfFirstlevel += tedadFilehaHarlevel.get(counter);
            levelCounter ++;

            if(levelCounter == tedadLayeha){
                break;
            }
        }


    }

    public static int listOfDirectories(String address) throws IOException {

        File[] files = new File(address).listFiles();
        //If this pathname does not denote a directory, then listFiles() returns null.

            nameOfFileList.clear();

            for (File file : files) {
                addressList.add(address + "\\" + file.getName());
                nameOfFileList.add(file.getName());
            }
            goldenWordSearcher(nameOfFileList);

            return nameOfFileList.size();
    }

    public static void goldenWordSearcher(List<String> listOfFiles) throws IOException {

        File_Handler file = new File_Handler();

        for (int counter = 0 ; counter<listOfFiles.size() ; counter++){
            if(listOfFiles.get(counter).contains(goldenWord)){
                System.out.println(listOfFiles.get(counter) + " is found in address : " + adresAvaliye );
                file.writeToFile(listOfFiles.get(counter) + " is found in address : " + adresAvaliye
                        + "\t" + (System.currentTimeMillis() - startTime) + "ms");
            }
        }

    }//end of search

}
