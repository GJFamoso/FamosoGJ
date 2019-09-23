
package activity9232019_no2;
import java.util.Random;
import java.util.Scanner;


public class Activity9232019_no2 {


    public static void main(String[] args) 
    
    {
        Scanner input = new Scanner (System.in);
                
        Random random = new Random();
     
        System.out.println("Rock: 0; Scissors: 1; Paper: 2");
        System.out.println("");
        
        int Rock = 0 , Scissors = 1, Paper = 2;
        System.out.print("Choose: ");
        byte player = input.nextByte();
        
        int computer = random.nextInt(2-1+0)+0;
        System.out.println("The computer chooses: " + computer);
        
        System.out.println("*************************************");
        if (player == 0)
        System.out.println("Player: Rock");
        if (player == 1)
        System.out.println("Player: Scissor");
        if (player == 2)
        System.out.println("Player: Paper");
        if (computer == 0)
        System.out.println("Computer: Rock");
        if (computer == 1)
        System.out.println("Computer: Scissors");
        if (computer == 2)
        System.out.println("Computer: Paper");
        System.out.println("");
        
        if (player == computer)System.out.println("It's a tie");
        if (player == 0 && computer == 1) System.out.println("Player Wins");
        if (player == 0 && computer == 2) System.out.println("Computer Wins");
        if (player == 1 && computer == 0) System.out.println("Computer Wins");
        if (player == 1 && computer == 2) System.out.println("Player Wins");
        if (player == 2 && computer == 0) System.out.println("Player Wins");
        if (player == 2 && computer == 1) System.out.println("Computer Wins");
    }
    
    
}
