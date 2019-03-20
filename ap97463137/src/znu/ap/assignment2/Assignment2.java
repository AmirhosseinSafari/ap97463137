package assignment2;

import java.util.*;
public class Assignment2 {
    
    public static void main(String[] args) {
        System.out.println("This program can show you a dimond by the size of your input.");
        System.out.println("Please follow the orders...");
        System.out.print("Please enter an odd number:");
        Scanner input = new Scanner(System.in);
        
        boolean flage = true;
        while(flage == true){//#2.1
        int n = input.nextInt();
        int s = n;
        if(n%2 == 0){//#1
            System.out.print("Wrong Input! Please enter an odd number:");//#2
        }
        else{
            flage = false;//#2.1                
            int i,j;
            for(i=1;i<=((n/2)+1);i++){              //mosalas balaee
                
                for(j=s/2;j>0;j--){//#3.2
                    System.out.print(" ");
                }
                s-=2;
                for(j=1;j<2*i;j++){//#3.1
                    System.out.print("*");
                }//end of small for
                System.out.print("\n");
                
            }//end of big for
            
            s = 1;
                    
            for(i=(n/2);i>0;i--){               //mosalas paeeni
                
                for(j=0;j<s;j++){//#3.2.1
                    System.out.print(" ");
                }//end of small for
                s++;
                for(j=1;j<=((2*i)-1);j++){//#3.1.1
                    System.out.print("*");
                }//end of small for
                System.out.print("\n");
                
            }//end of big for
        }//end of else
    }//end of while
        System.out.print("Enter any key to exit...");
        try{
            System.in.read();
        }
        catch(Exception ex){}
    }
    
}
