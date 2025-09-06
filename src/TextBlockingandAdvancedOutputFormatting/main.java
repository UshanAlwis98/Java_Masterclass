package TextBlockingandAdvancedOutputFormatting;

public class main {

    public static void main(String [] args){

        String bulletIt = "Print a Bulleted list \n" +
                "\t\t\t\t\t\u2022 First Bullet \n"+
                "\t\t\t\t\t\u2022 Second Bullet";

        System.out.println(bulletIt);

        String textBlock = """
                Bullet list as a textblock
                    \u2022 First bullet \n
                    \u2022 Second bullet \n""";

        System.out.print(textBlock);

        int age = 27;

        System.out.printf("Your age is %d\n",age);

        int yearOfBirth = 2025-age;
        System.out.printf("Age %d, Birth Year %d",age,yearOfBirth);


    }
}
