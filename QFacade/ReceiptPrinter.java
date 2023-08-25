/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QFacade;

/**
 *
 * @author HP
 */
class ReceiptPrinter {
    public void printReceipt(String accountNumber, int amount){
        System.out.println("Receipt printer: " + amount + " Taka has been deducted from " + accountNumber + ".");
    }
}
