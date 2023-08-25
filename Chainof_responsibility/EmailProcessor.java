/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chainof_responsibility;

/**
 *
 * @author HP
 */
public class EmailProcessor {
    public static void main(String[] args){
        EmailHandler spamHandler = new SpamHandler();
        EmailHandler attachmentHandler = new AttachmentHandler();
        
        spamHandler.setNextHandler(attachmentHandler);
        
        Email email = new Email("Important" ,false, true);
        Email email1 = new Email("Noooo",false,false);
        
        spamHandler.processEmail(email);
        attachmentHandler.processEmail(email1);
    }
}
