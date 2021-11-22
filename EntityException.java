/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.lab1project.projectmodel;

/**
 *Class EntityException runs when exception is detected and returns error information.
 * @author jakub
 */
public class EntityException extends Exception {
    /**
     * Method for exception if user insert letter instead of digit
     * @param error a message for model method 
     */
    public EntityException(String error){
        super(error);
    }
}
