/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.lab1project.projectview;
import java.util.*;
/**
 *
 * @author Jakub
 */

public class projectview {

    int dec;
    Scanner get =new Scanner(System.in);
    public int getNum()
    {
        System.out.println("Podaj liczbe do konwersji ");
        return get.nextInt();
        
    }
    /**
     * Method prints grays code in console.
     * @param kp table of char that contains code
     */
    public void printBinary(char[] kp){
        //System.out.println(get);
        System.out.println("Gray form:");
        for (char i : kp)
            System.out.print(i + "");
        
    }
}
