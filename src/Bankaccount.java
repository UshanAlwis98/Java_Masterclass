public class Bankaccount {
    private String accountNumber;
    private int accountBalance = 2000;
    private String customerName;
    private String email;
    private String phoneNumber;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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


    //  Default constructor
    public Bankaccount() {
        System.out.println("Empty constructor called");
    }

    // 5-parameter main constructor
    public Bankaccount(String accountNumber, int accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with all parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // 3-parameter constructor
    public Bankaccount(int accountBalance, String customerName, String accountNumber) {
        this(accountNumber, accountBalance, "Lal", "ushanloshitha@gmail.com", "0767649483");
        System.out.println("Constructor with 3 parameters called");
    }

    //  2-parameter constructor
    public Bankaccount(String email, String phoneNumber) {
        this("Gimantha", "19691969", email, phoneNumber); //
        System.out.println("Constructor with 2 parameters called");
    }

    //  4-parameter constructor
    public Bankaccount(String customerName, String accountNumber, String email, String phoneNumber) {
        this(accountNumber, 2500, customerName, email, phoneNumber); //
        System.out.println("Constructor with 4 parameters called");
    }
}
