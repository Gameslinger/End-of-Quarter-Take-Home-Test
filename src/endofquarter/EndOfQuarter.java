/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;

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
        
        for(int i = 1; i <= num; i++){
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
            JOptionPane.showMessageDialog(null, "Input another radius","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            break;
        }
        
        }while(true);
        
        String colorName;
        String[] options = {"red","blue","green"};
        int colorVal = JOptionPane.showOptionDialog(null, "Set color of circle", "Choose a color: ", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null,options,"");
        Color color;
        switch(colorVal){
            case 0:
                colorName = "red";
                color = new Color(255,0,0,255);
                break;
            case 1:
                colorName = "blue";
                color = new Color(0,255,0,255);
                break;
            case 2:
                colorName = "green";
                color = new Color(0,0,255,255);
                break;
            default:
                colorName = "Black";
                color = new Color(0,0,0,255);
        }
        
        System.out.println("The "+colorName+" has an area of: "+area);
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(new DrawCircle(color,radiusEntry),BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(JFrame.MAXIMIZED_VERT,JFrame.MAXIMIZED_HORIZ);
        frame.setVisible(true);
    }
    
}
