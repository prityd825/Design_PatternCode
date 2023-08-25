/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chainof_responsibility;

/**
 *
 * @author HP
 */
public interface EmailHandler {
    void setNextHandler(EmailHandler handler);
    void processEmail(Email email);
    
}
