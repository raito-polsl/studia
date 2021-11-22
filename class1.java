/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.lab1project;
import pl.polsl.lab1project.projectcontroller.*;
import pl.polsl.lab1project.projectmodel.*;
/**
 *
 * @author jakub
 */
public class class1 {
    /**
     * 
     * @param args argument from command line  
     */
    public static void main(String[] args){
        projectcontroller controller = new projectcontroller();
        if(args.length==0)
            controller.calc();
        else 
            controller.calc(Integer.parseInt(args[0]));
        
    }
}
