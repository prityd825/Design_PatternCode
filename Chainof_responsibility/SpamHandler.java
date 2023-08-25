/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chainof_responsibility;

/**
 *
 * @author HP
 */
public class SpamHandler implements EmailHandler{
    private EmailHandler nextHandler;
    @Override
    public void setNextHandler(EmailHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processEmail(Email email) {
        if(email.isSpam()){
           System.out.println("Email marked as spam: "+email.getSubject());
        
    } else if(nextHandler != null){
        nextHandler.processEmail(email);
    }
    }
    
}
