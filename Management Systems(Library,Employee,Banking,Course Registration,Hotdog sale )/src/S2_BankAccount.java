public class S2_BankAccount {
    private String Account_number , Account_holderName;
    private double balance;


    public S2_BankAccount(String account_number, String account_holderName, double balance) {
        Account_number = account_number;
        Account_holderName = account_holderName;
        this.balance = balance;
    }

    public String getAccount_number() {
        return Account_number;
    }

    public String getAccount_holderName() {
        return Account_holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount>0) {
            balance +=amount;
            System.out.println("Your total account balance is " + amount + "after deposit");
        }else{
            System.out.println("Error! Invalid amount");
        }

    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Error!!! you have not enough amount to withdraw because your balance is "+balance);
        }else if(amount<500){
            System.out.println("Minimum withdraw balance is 500 ");
        }else {
            balance -=amount;
            System.out.println("Thankyou for using our service now your balance is "+balance);
        }

    }
    public void display() {
        System.out.println("Account Number : "+Account_number+"\nAccount Holder Name : "+Account_holderName+"\nAccount Balance : "+balance);
    }


}
