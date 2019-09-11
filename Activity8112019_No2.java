
import java.util.Scanner;


public class Activity8112019_No2 {


    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        double distance , m_gallon, p_gallon, cost;
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble ();
        System.out.print("Enter miles per gallon: ");
        m_gallon = input.nextDouble();
        System.out.print    ("Enter price per gallon: ");
        p_gallon = input.nextDouble ();
        
        
         
             
        cost = (distance/m_gallon)* p_gallon ;
        
        System.out.printf("The cost of driving is $%.2f" , cost);
        
        
                
        
    }
    
}
