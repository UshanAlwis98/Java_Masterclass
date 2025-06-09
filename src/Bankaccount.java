public class Bankaccount {
    private String accountNumber;
    private int accountBalance = 2000;
    private String customerName;
    private String email;
    private String phoneNumber;

    // 1. Default constructor
    public Bankaccount() {
        System.out.println("Empty constructor called");
    }

    // 2. 5-parameter main constructor
    public Bankaccount(String accountNumber, int accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with all parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // 3. 3-parameter constructor
    public Bankaccount(int accountBalance, String customerName, String accountNumber) {
        this(accountNumber, accountBalance, customerName, "ushanloshitha@gmail.com", "0767649483");
        System.out.println("Constructor with 3 parameters called");
    }

    // 4. 2-parameter constructor
    public Bankaccount(String email, String phoneNumber) {
        this("Gimantha", "19691969", email, phoneNumber); // ✅ now calls 4-param constructor
        System.out.println("Constructor with 2 parameters called");
    }

    // 5. 4-parameter constructor
    public Bankaccount(String customerName, String accountNumber, String email, String phoneNumber) {
        this(accountNumber, 2500, customerName, email, phoneNumber); // ✅ now calls 5-param
        System.out.println("Constructor with 4 parameters called");
    }
}
