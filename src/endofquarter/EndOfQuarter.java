/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabe, Clara, Bryson 
 */

public class EndOfQuarter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Page One:
        List<Double> numbers = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please give me an integer:");
        
        int num = input.nextInt();
        
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
        System.out.println("Give me another number:");
        num = input.nextInt();
        
        if(num > 0){
            Double sqrtNum = MathFunctions.SquareRootAndAddThree(num);
           if(sqrtNum<=1000){
           numbers.add(sqrtNum);
           }
        }
        double sum = 0;
        
        for(Double dbl : numbers){
          sum += dbl;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("\n");
        
        //AP requirement
        int radiusEntry;
        
        double area;
        do{
        radiusEntry = Integer.parseInt(JOptionPane.showInputDialog("Give me an Integer"));
        area = MathFunctions.AreaOfCircle(radiusEntry);
        if(area == -1){
            JOptionPane.showMessageDialog(null, "Input another radius","Error",JOptionPane.INFORMATION_MESSAGE);
        }else{
            break;
        }
        }while(true);
        
        
    }
    
}
