public class Bankaccount {
    private String accountNumber;
    private int accountBalance=2000;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumberParameter){
        this.accountNumber = accountNumberParameter;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depostingfund(int depostingValueParameter){
            accountBalance += depostingValueParameter;
            System.out.println("Your new account balance is= "+ accountBalance);
    }

    public void withdrawingfund(int withdrawingValueParameter){
            if (accountBalance-withdrawingValueParameter<0){
                System.out.println("You do not have enough funds to do this transaction and you only have= " + accountBalance);
            }

            else {
                accountBalance -= withdrawingValueParameter;
                System.out.println("Your new account balance is= " + accountBalance);
            }
    }
}
