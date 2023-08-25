/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author HP
 */
interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
        
    void dispense(Currency cur);
}

class Dollar50 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
       chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
       if(cur.getAmount() >= 50){
           int num = cur.getAmount()/50;
           int remainder = cur.getAmount()%50;
           System.out.println("Dispensing "+num+" 50$ note");
           if(remainder != 0)
               this.chain.dispense(new Currency(remainder));
           else
               this.chain.dispense(cur);
       }  
    }
    
}

class Dollar20 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
       chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
       if(cur.getAmount() >= 20){
           int num = cur.getAmount()/20;
           int remainder = cur.getAmount()% 20;
           System.out.println("Dispensing "+num+" 20$ note");
           if(remainder != 0)
               this.chain.dispense(new Currency(remainder));
           else
               this.chain.dispense(cur);
       }  
    }
    
}


class Dollar10 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
       chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
       if(cur.getAmount() >= 10){
           int num = cur.getAmount()/10;
           int remainder = cur.getAmount()% 10;
           System.out.println("Dispensing "+num+" 10$ note");
           if(remainder != 0)
               this.chain.dispense(new Currency(remainder));
           else
               this.chain.dispense(cur);
       }  
    }
    
}

