public class Customer {

    private String name;
    private double credit_limit;
    private String email_address;

    public String getName(){
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address(){
        return  email_address;
    }

    public  Customer(String name,double credit_limit,String email_address){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;
    }

    // No args constructor
    public Customer(){
        this("Ushan Loshitha","ushanloshitha@gmail.com");
    }
    // 2 parametrized constructor
    public Customer(String name,String email_address){
        this(name,458.35,email_address);
    }
}




