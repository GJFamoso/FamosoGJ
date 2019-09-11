
import java.util.Scanner;


public class Activity8112019_No1 
{

    public static void main(String[] args) 
    {
        
    Scanner input = new Scanner (System.in);
        
        int t_seconds, seconds, minutes, hour, time;
        
        System.out.print("Enter time in seconds:  ");
        t_seconds = input.nextInt();
        
        seconds = t_seconds % 60;
        minutes = (t_seconds%3600)/60; 
        hour = t_seconds/ 3600;
        
       
        
        System.out.println("Time is " + hour + " " + "hour/s" + " " +  minutes + " " + "minutes/s" + " " + seconds + " " + "second/s");
                
        
    }
 
                
        

   
}
