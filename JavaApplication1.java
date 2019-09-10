
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        double gross, Ftax, Stax, SStax, Mtax,pp, HI, netpay, total_netpay;
        
        System.out.print("Input Employee Name: ");
        String name = input.nextLine();
        System.out.print("Gross Amount: $");
        gross = input.nextDouble();
        
        Ftax = gross * 0.15;
        Stax = gross * 0.035;
        SStax = gross * 0.0575;
        Mtax = gross * 0.0275;
        pp = gross * 0.05;
        HI = 75; 
        netpay = Ftax + Stax + SStax + Mtax + pp + HI;
        total_netpay = gross - netpay; 
        
        System.out.println("Name: " + name);
        System.out.printf("Gross Amount: $%.2f" , gross);
        System.out.println("");
        System.out.printf("Federal Tax: $%.2f" , Ftax);
        System.out.println("");
        System.out.printf("State Tax: $%.2f" , Stax);
        System.out.println("");
        System.out.printf("Social Security Tax:  $%.2f" , SStax);
        System.out.println("");
        System.out.printf("Medicare/MEdicaid Tax:  $%.2f" , Mtax);
        System.out.println("");
        System.out.printf("Pension Plan:  $%.2f" , pp);
        System.out.println("");
        System.out.printf("Health Insurance: $%.2f " , HI);
        System.out.println("");
        System.out.printf("Netpay:  $%.2f"  , total_netpay);
        

   
   
       
                 
        
        

        
        
        
        
        
        
        
    }
    
}
