
import java.util.Scanner;


public class JavaApplication2 {

    public static void main(String[] args) 
                      
    {    
        Scanner input= new Scanner (System.in);
        
        System.out.println(" *********     ***        *        *      ");
        System.out.println(" *       *   *     *     ***      * *     ");
        System.out.println(" *       *  *       *   *****    *   *    ");
        System.out.println(" *       *  *       *     *     *     *   ");
        System.out.println(" *       *  *       *     *    *       *  ");
        System.out.println(" *       *  *       *     *     *     *   ");
        System.out.println(" *       *  *       *     *      *   *    ");
        System.out.println(" *       *   *     *      *       * *     ");
        System.out.println(" *********     ***        *        *      ");
        
        System.out.println("");
        System.out.println("");
        
        double pizzaprice, e_toppings, tax, cost;
        System.out.print("Input the number of pizza: ");
        int n_pizza = input.nextInt();
        System.out.print("Input the total number of toppings:  ");
        int toppings = input.nextInt();
        
        pizzaprice = 12.00;
        e_toppings = 1.50;
        tax = ((pizzaprice*n_pizza)+(toppings*e_toppings))*0.05;
        cost = ((pizzaprice*n_pizza)+(toppings*e_toppings))+tax;
         
        
        System.out.println("Receipt: Number of Pizza: " + n_pizza);
        System.out.println("Number of toppings:  " + toppings);
        System.out.println("Cost (incl tax: ) " + cost);
    }
    
}
