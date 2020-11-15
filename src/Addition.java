import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stace Omwando
 */
public class Addition {
    public static void main (String args[]){
        int y = 5;
        
        if (y<=6)
            y--;
        
        while (y>2)
            y=y-2;
        
        for (y=0;y<3;y++)
            System.out.println("Y is "+y);
        
        do
            System.out.println("Hello");
        while(y>3);
    }
    
}
