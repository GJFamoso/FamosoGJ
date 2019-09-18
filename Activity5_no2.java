
import java.util.Scanner;


public class Activity5_no2 {

  
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int n1, n2, n3;
        
        System.out.print("Enter Three numbers: ");
        n1 = input.nextInt ();
        n2 = input.nextInt ();
        n3 = input.nextInt ();
        
        if (n1 > n2 && n1 > n3) System.out.println("Largest is " + n1);
        else if (n2 > n1 && n2 > n3) System.out.println("Largest is " + n2);
        else if (n3 > n1 && n3 > n2) System.out.println("Largest is " + n3);
        
    }
    
}
