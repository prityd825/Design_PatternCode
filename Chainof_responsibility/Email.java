/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chainof_responsibility;

/**
 *
 * @author HP
 */
class Email {
    private String subject;
    private boolean isSpam;
    private boolean hasAttachments;
    
    public Email(String subject,boolean isSpam, boolean hasAttachments){
        this.subject = subject;
        this.isSpam = isSpam;
        this.hasAttachments= isSpam;
        if(isSpam == true){
            System.out.println("Spam");}
            else if(hasAttachments == true){
                    System.out.println("Attachments");              
        }else
            {
                System.out.println("None can process");
            }
    }
    
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    
     public boolean isSpam() {
        return isSpam;
    }
    
    public void setSpam(boolean spam){
        isSpam = spam;
    }
    
    public boolean hasAttachments(){
        return hasAttachments;
    }
    
    public void setAttachments(boolean hasAttachments){
        this.hasAttachments = hasAttachments;
    }
}
