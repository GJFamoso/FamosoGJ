
import java.util.Scanner;


public class QNo2 {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
             int a = 3, b = 28, c = 5 , d = 9 , e = 8 , f = 10 , g = 12 , h = 2 , i = 1 , j = -19, ans;
         ans = a + b;
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
