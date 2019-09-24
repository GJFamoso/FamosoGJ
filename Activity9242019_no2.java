
package activity9242019_no2;

import java.util.Scanner;


public class Activity9242019_no2 
{


    public static void main(String[] args)
    
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        byte n1 = input.nextByte();
        System.out.print("Enter the number of days elapsed since today: ");
        byte n2 = input.nextByte();
        
        String day = "";
        String future = "";
        
        switch (n1)
            {
                case 0:
                     day=("Sunday");
                break;
                case 1:
                    day=("Monday");
                break;
                case 2:
                    day=("Tuesday");
                break;
                case 3:
                    day=("Wednesday");
                break;
                case 4:
                    day=("Thursday");
                break;
                case 5:
                    day=("Friday");
                break;
                case 6:
                    day=("Saturday");
                break;
            }
                        
        switch (n2%7)
            {
                case 0:
                    future=("Sunday");
                break;
                case 1:
                    future=("Monday");
                break;
                case 2:
                    future=("Tuesday");
                break;
                case 3:
                    future=("Wednesday");
                break;
                case 4:
                    future=("Thursday");
                break;
                case 5:
                    future=("Friday");
                break;
                case 6:
                    future=("Saturday");
                break;
            }   
           
                
        System.out.println("Today is " + day + " and the future day is " + future);
        
    }
                  
        
        
}
    

