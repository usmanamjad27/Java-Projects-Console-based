public class S2_SavingAccount  extends S2_BankAccount{
    private int withdrawlimit;

    public S2_SavingAccount(String account_number, String account_holderName, double balance, int withdrawlimit) {
        super(account_number, account_holderName, balance);
        this.withdrawlimit = withdrawlimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawlimit) {
            System.out.println("Error! Withdrawal amount exceeds the limit of " + withdrawlimit);
        } else {
            super.withdraw(amount); // Call the parent class method to handle balance checking
        }
    }}
