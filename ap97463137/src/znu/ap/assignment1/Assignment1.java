
package assignment1;

public class Assignment1 {              //created by Amirhossein Safari

    public static void main(String[] args) {
    System.out.println("Diamond\n");
    int a = 4;
    int i,j,h;
    int s = a;
    for(i=1;i<=a;i++)           //mosalase bozorge bala (n marhale)
    {
        for(h=1;h<=s;h++)        // ejade fasele haye sare har khat
        {
            System.out.print(" ");
        }
        s--;
        for(j=1;j<2*i;j++)         //ejade tedade fardi setare
        {
          System.out.print("*");
        }
        System.out.print("\n");
    }
    s = 1;
    for(i=(a-1);i>=1;i--)           //mosalase kochike paeeni (n-1 marhale)
    {
        for(h=0;h<=s;h++)           // ejade fasele haye sare har khat
        {
            System.out.print(" ");
        }
        s++;
        for(j=2*i;j>1;j--)          //ejade tedade fardi setare
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
    System.out.println("press enter to exit...");
    try{
        System.in.read();
    }
    catch(Exception ex){}
        }
    }
    

