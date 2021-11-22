/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.lab1project.projectcontroller;
import pl.polsl.lab1project.projectmodel.*;
import pl.polsl.lab1project.projectview.*;
/**
 *
 * @author Jakub
 */
public class projectcontroller {

    projectview view = new projectview();
    projectmodel model = new projectmodel();
    
/**
 * This method starts main part of calculations in model class. calculations in ths method are based on decimal number from command line.
 */
public void calc()
{ 
    try{
        model.setNum(view.getNum());
        model.InvaildEntity();
    } catch(EntityException e){
        System.out.println(e.getMessage());
                }
    
    model.setNum(view.getNum());
    char[] gf = new char[model.getNum()];    
    view.printBinary(model.calculate());
}
/**
 * This method starts main part of calculations in model class. Calculations in this method are based on decimal number from user interface.
 * @param nr decimal number writen by user  
 */
public void calc(int nr){
    model.setNum(nr);
    char[] gf = new char[model.getNum()];    
    view.printBinary(model.calculate());
}

}
