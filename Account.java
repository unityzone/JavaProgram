
package javaconstractor;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;


    public void diposit(double dipositAmmount){
        this.balance += dipositAmmount;
        System.out.println("You have Rechived " + dipositAmmount + ". Your Current Balance is " + this.balance);
    }
    
    public void withdrawal(double withdrawAmmount){
        
        if(this.balance - withdrawAmmount < 0){
            System.out.println("You have only " + this.balance + ", Widrawal not procced");
            
        } else{
            this.balance -= withdrawAmmount;
            System.out.println("You withdraw " + withdrawAmmount + ". Your remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
