
import java.util.Scanner;


public class Activity5_no1 {

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Answer each of the following questions with a number from 1 to 5 such that 1 means Never and 5 means ALWAYS");
        
        System.out.println("");
        System.out.print("1. I am competitive: ");
        byte s1 = input.nextByte();
        System.out.print("2. I am annoyed by people who are late for appointment: ");
        byte s2 = input.nextByte();
        System.out.print("3. I perform several tasks simultaneously: ");
        byte s3 = input.nextByte();
        System.out.print("4. I am ambitious: ");
        byte s4 = input.nextByte();
        System.out.print("5. I rush to get tasks completed: ");
        byte s5 = input.nextByte();
        System.out.print("6. I worry about the future: ");
        byte s6 = input.nextByte();
        System.out.print("7. I am in arace with time: ");
        byte s7 = input.nextByte();
        System.out.print("8. I speak very rapidly: ");
        byte s8 = input.nextByte();
        System.out.println("");
        
        int sum = s1+s2+s3+s4+s5+s6+s7+s8;
        
        System.out.print("Score:" + sum+ ".  ");
  
        
        if (sum>=35 || sum==40)  System.out.println("Type A");
        else if (sum>=21) System.out.println("Between A and B, tending towards A");
        else if (sum>=12) System.out.println("Between A and B, tending towards B");
        else if(sum>=8) System.out.println("Type B"); 
        
        
    }
    
}
