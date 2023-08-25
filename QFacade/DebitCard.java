/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QFacade;

/**
 *
 * @author HP
 */
public class DebitCard {
    private CentralDatabase centralDatabase;
    private AmountCalculator amountCalculator;
    private LEDScreen ledScreen;
    private ReceiptPrinter receiptPrinter;
    
    
    public DebitCard() {
        centralDatabase = new CentralDatabase();
        amountCalculator = new AmountCalculator();
        ledScreen = new LEDScreen();
        receiptPrinter = new ReceiptPrinter();
    }

    void withdraw(String accountNumber, int amount) {
        centralDatabase.ValidateAccount(amount);
        amountCalculator.debitAmount(accountNumber, amount);
        ledScreen.showSuccessMessage();
        receiptPrinter.printReceipt(accountNumber, amount);
    }
}
