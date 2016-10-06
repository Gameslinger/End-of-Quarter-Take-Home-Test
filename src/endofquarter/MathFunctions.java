/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

/**
 *
 * @author student
 */
public class MathFunctions {
    public static double SquareRootAndAddThree(double input){
        return Math.sqrt(input)+3;
    }
    public static double AreaOfCircle(int num){
     if(num < 0)return -1;
     
     return Math.PI * num * num;
     
    }
}
