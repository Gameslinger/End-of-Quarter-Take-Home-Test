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
        
        System.out.println("Please give me an integer:\n");
        
        int num = input.nextInt();
        
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
        num = input.nextInt();
        
        if(num > 0){
           numbers.add(new Double(MathFunctions.SquareRootAndAddThree(num)));
        }
        
        }
}
