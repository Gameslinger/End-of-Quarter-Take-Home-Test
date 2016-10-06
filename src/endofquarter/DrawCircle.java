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
    Color clr;
     int side;
    DrawCircle(Color clr, int side){
        this.clr = clr;
        this.side = side;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paint(g);
        g.setColor(clr);
        g.fillOval(0, 0, side, side);
    }
}