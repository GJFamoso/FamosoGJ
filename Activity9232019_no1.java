
package activity9232019_no1;

import java.util.Scanner;


public class Activity9232019_no1 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a 10-digit phone number: ");
        long digits = input.nextLong();
        String number = Long.toString(digits);
        
        
        if (number.startsWith("800")|| number.startsWith("888") || number.startsWith("877") || number.startsWith("866"))
            {
                String three_nums = number.substring(0,3);
                System.out.print(three_nums + "-");
                String three_nums2 = number.substring(3,6);
                System.out.print(three_nums2 + "-");
                String three_nums3 = number.substring(6);
                System.out.print(three_nums3);
                System.out.println("is a toll number");
            }
        
        
        else
            {
                System.out.println(digits + " is not a toll nummber");
            }
   
               
    }
    
}
