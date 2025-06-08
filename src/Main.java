public class Main {
    public static void main(String[] args) {

        Bankaccount bankacc1 = new Bankaccount("1998876",1200,"Ushan","ushanloshitha@gmail.com","0767649483");


        System.out.println("Your Account number is= " + bankacc1.getAccountNumber());
        System.out.println("Your customer name is= " + bankacc1.getCustomerName());


        bankacc1.depostingfund(30);
        bankacc1.withdrawingfund(3000);


        Student stu = new Student();
        stu.setGrade(100);
        System.out.println("Your grade is= " + stu.getGrade());

        Gradebook gradestu = new Gradebook();
        gradestu.addStudent("Loshitha");


        Bankaccount bankacc2 = new Bankaccount(8000,"Loshitha","1948");
        System.out.println("Your new value is= " + bankacc2.getAccountBalance() + " "+ bankacc2.getAccountNumber());

    }
}