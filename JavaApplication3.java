
import java.util.Scanner;


public class JavaApplication3 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
             int a = 0, b = 0, c = 0 , d = 0 , e = 0 , f = 0 , g = 0 , h = 0 , i = 0 , j = 0;
             
             System.out.print("1.");
              a = input.nextInt();
             System.out.print("2.");
              b = input.nextInt();
             System.out.print("3.");
              c = input.nextInt();
             System.out.print("4.");
              d = input.nextInt();
             System.out.print("5.");
              e = input.nextInt();
             System.out.print("6.");
              f = input.nextInt();
             System.out.print("7.");
              g = input.nextInt();
             System.out.print("8.");
              h = input.nextInt();
             System.out.print("9.");
              i = input.nextInt();
             System.out.print("10.");
              j = input.nextInt();


             
        int ans = a + b;
        int ans2 = ans + c;
        int ans3 = ans2 + d;
        int ans4 = ans3 + e;
        int ans5 = ans4 + f;
        int ans6 = ans5 + g;
        int ans7 = ans6 + h;
        int ans8 = ans7 + i;
        int ans9 = ans8 + j;
        
        System.out.print("Running Sum : " + a + " " + ans + " " + ans2 + " " + ans3 + " " + ans4 + " " + ans5 + " " + ans6 + " " + ans7 + " " + ans8 + " " + ans9 );
    }
    
}
