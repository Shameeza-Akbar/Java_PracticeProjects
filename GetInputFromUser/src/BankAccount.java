public class BankAccount {
    private String customerName;
    private int accountNumber;
    private int accountBalance;
    private int phoneNumber;
    public void deposit (int money){
        if(money>0) {
            this.accountBalance += money;
            System.out.println("Deposited");
        }
        else System.out.println("You can not deposit negative value");
    }
    public void withdraw (int money){
        if(this.accountBalance>money) {
            this.accountBalance -= money;
            System.out.println("Successful");
        }
        else System.out.println("Your balance in insufficient.");
    }
    public String getCustomerName(){
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
