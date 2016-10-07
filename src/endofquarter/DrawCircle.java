/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class DrawCircle extends JPanel {
    //Stores color of circle
    Color clr;
    //how long/wide to draw circle:
     int diameter;
     //Assigns values to arguments:
    DrawCircle(Color clr, int side){
        this.clr = clr;
        this.diameter = side * 2;
    }
    //Overrides paintComponent from JPanel:
    @Override
    public void paintComponent(Graphics g){
         super.paintComponent(g);
         //Set color to paint with:
        g.setColor(clr);
        //Draws the circle 
        g.fillOval(0, 0, diameter, diameter);
    }
}