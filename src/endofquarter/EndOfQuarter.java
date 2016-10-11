/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabe Maxfield, Clara Durling, Bryson Beam
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
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        
        
        System.out.println("Give me another number:");
        num = input.nextInt();

        if (num > 0) {
            Double sqrtNum = MathFunctions.SquareRootAndAddThree(num);
            if (sqrtNum <= 1000) {
                numbers.add(sqrtNum);
            } 
            else {
                double sum = 0;
                for (Double dbl : numbers) {
                    sum += dbl;
                }
                System.out.println("The sum is: " + sum);
            System.exit(1);
            }
        }


        System.out.println("\n");
        //AP requirements
        int radiusEntry;
        double area;
        
        do {
            radiusEntry = Integer.parseInt(JOptionPane.showInputDialog("Give me the radius."));
            area = MathFunctions.AreaOfCircle(radiusEntry);
            if (area == -1) {
                JOptionPane.showMessageDialog(null, "Input another radius", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                break;
            }

        } while (true);

        String colorName;
        String[] options = {"red", "blue", "green"};
        int colorVal = JOptionPane.showOptionDialog(null, "Set color of circle", "Choose a color: ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, "");
        Color color;
        switch (colorVal) {
            case 0:
                //Color(Red value, Green Value, Blue Value, Opacity);
                colorName = "red";
                color = new Color(255, 0, 0, 255);
                break;
            case 2:
                colorName = "green";
                color = new Color(0, 255, 0, 255);
                break;
            case 1:
                colorName = "blue";
                color = new Color(0, 0, 255, 255);
                break;
            default:
                colorName = "Black";
                color = new Color(0, 0, 0, 255);
        }

        System.out.println("The " + colorName + " circle has an area of: " + area);

        //Creates JFrame to hold JPanel with title "Your circle":
        JFrame frame = new JFrame("Your circle");
        //Adds object from drawCircle object:
        frame.getContentPane().add(new DrawCircle(color, radiusEntry), BorderLayout.CENTER);
        //Sets how program should terminate:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Setting size to full screen: Is this what XMAX and YMAX stand for??
        Dimension d = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(d.width, d.height);
        //Shows the frame:
        frame.setVisible(true);
        
    }

}
