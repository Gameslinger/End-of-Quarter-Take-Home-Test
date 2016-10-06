/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gabe, Clara, Bryson 
 */

public class EndOfQuarter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        }
}
