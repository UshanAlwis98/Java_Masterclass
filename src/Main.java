public class Main {
    public static void main(String[] args) {

    Bankaccount acc1 = new Bankaccount(13000,"Sugath","13339");
    System.out.println("Your account number is= " + acc1.getAccountNumber());
    System.out.println("Your name is= " + acc1.getCustomerName());
    acc1.setAccountBalance(500);
    System.out.println("Your account balance is= " + acc1.getAccountBalance());

    }
}