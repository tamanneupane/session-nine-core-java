package day2;

public class BankAccount {

    // States

    // Get but not set
    private String accountNumber = "123456789";

    // Get and Set both allowed
    private String accountHolderName;

    // Get and Set both allowed
    private AccountType accountType;

    // Get and Set both allowed
    private String connectedMobileNumber;

    // Get and Set both allowed
    private String address;

    // Get and Set both allowed
    private String bsbNumber;

    // Get and Set both allowed
    private double accountBalance;

    // Set and but not Get
    private String socialSecurityNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getConnectedMobileNumber() {
        return connectedMobileNumber;
    }

    public void setConnectedMobileNumber(String connectedMobileNumber) {
        this.connectedMobileNumber = connectedMobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBsbNumber() {
        return bsbNumber;
    }

    public void setBsbNumber(String bsbNumber) {
        this.bsbNumber = bsbNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Behaviour

    /*
    Open Account
    Close Account
    Deposit
    Withdraw
    transferBalance
    */

    /**
     * kasjkdhkasjdhasdkjaslo
     * @param fromAccount ashdkjashdkajshd
     * @param toAccount khaksjdhaksjdhkasd
     * @param balance kajshdkajshdkjashd
     */
    public void transferBalance(BankAccount fromAccount, BankAccount toAccount, double balance){
        double fromFinalBalance = fromAccount.getAccountBalance() - balance;
        double toFinalBalance = toAccount.getAccountBalance() + balance;

        fromAccount.setAccountBalance(fromFinalBalance);
        toAccount.setAccountBalance(toFinalBalance);


    }

}
