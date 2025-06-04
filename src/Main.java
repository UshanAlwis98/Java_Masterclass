public class Main {
    public static void main(String[] args) {

        Bankaccount bankacc = new Bankaccount();

        bankacc.setAccountNumber("19981998");
        System.out.println("Your Account number is= " + bankacc.getAccountNumber());


        bankacc.depostingfund(30);
        bankacc.withdrawingfund(2000);


    }
}