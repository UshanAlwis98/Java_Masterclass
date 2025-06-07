public class Main {
    public static void main(String[] args) {

        Bankaccount bankacc = new Bankaccount("19981998",1200,"Ushan","ushanloshitha@gmail.com","0767649483");

        bankacc.setAccountNumber("");
        System.out.println("Your Account number is= " + bankacc.getAccountNumber());


        bankacc.depostingfund(30);
        bankacc.withdrawingfund(3000);

        Student stu = new Student();
        stu.setGrade(100);
        System.out.println("Your grade is= " + stu.getGrade());

        Gradebook gradestu = new Gradebook();
        gradestu.addStudent("Loshitha");



    }
}