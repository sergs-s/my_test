/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ssv
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] mass = {
            {11, 12, 13},
            {21, 22, 23},
            {31, 32, 44}
        };
        
//        System.out.println("aaa" + "!");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.print(String.valueOf(mass[i][j])+" ");
            }
            System.out.println("");
            
        }
    }
    
}
