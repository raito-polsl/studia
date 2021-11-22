/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.lab1project.projectmodel;
import pl.polsl.lab1project.projectview.*;
import java.io.*;
import pl.polsl.lab1project.projectcontroller.projectcontroller;

/**
 * 
 * @author jakub
 */
public class projectmodel {
     private int Num;
     /**
      * Method checks if exception occured
      * @throws EntityException 
      */
     public void InvaildEntity()
     throws EntityException
     {
         if(Character.isLetter(Num))
             throw new EntityException("Incorrect entity, please insert digit");
         
         
     }
     /**
      * This method compares 2 bytes of binary code and checks it for integrity of gray's code.
      * @param a used as comparsion with second char of code
      * @param b used as comparsion with first char of code 
      * @return returns 0 or 1 for change in code
      */
     public char xor(char a, char b)
    {
        if (a == b)
            return '0';
        else
            return '1';
    }
     /**
      * This method gets number from user 
      * @return Returns number for use in program 
      */
     public int getNum(){
         return this.Num;
     }
     /**
      * This method sets decimal number for conversion into binary code
      * @param nr decimal number that will be converted into binary code 
      */
     public void setNum(int nr){
         this.Num=nr;
     }
     /**
      * Method executes multiply actions. Converts decimal number into string binary code. sets char table that contains gray's code, Sets char table to the beggining of string.
      * stars method GRY, and returns char table.
      * @return returns table of chars that contains gray's code
      */
     public  char[] calculate(){
           
      
           String bin = Integer.toBinaryString(Num);          
           char[] gf = new char[bin.length()];
           gf[0] = bin.charAt(0);
           GRY(gf, bin, 1);
           return gf;

}
     /**
      * Method executes main coversion from binary string to gray's char table.
      *
      * @param gf table of cahrs that contains gray's code 
      * @param bin string which contains binary code for conversion
      * @param i iterator that goes through string 
      * @return returns char table which contains gray's code. Second return returns method for recurention.
      *  
      */
    public char[] GRY(char[] gf, String bin, int i)
    {
        if (i == bin.length())
            return gf;
        gf[i] = xor(bin.charAt(i), bin.charAt(i - 1));
        i++;
        return GRY(gf, bin, i);
    }
     
}