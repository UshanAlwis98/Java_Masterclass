public class Main {
    public static void main(String[] args) {

        Bankaccount bankacc = new Bankaccount("1998876",1200,"Ushan","ushanloshitha@gmail.com","0767649483");


        System.out.println("Your Account number is= " + bankacc.getAccountNumber());
        System.out.println("Your customer name is= " + bankacc.getCustomerName());


        bankacc.depostingfund(30);
        bankacc.withdrawingfund(3000);

        Student stu = new Student();
        stu.setGrade(100);
        System.out.println("Your grade is= " + stu.getGrade());

        Gradebook gradestu = new Gradebook();
        gradestu.addStudent("Loshitha");



    }
}