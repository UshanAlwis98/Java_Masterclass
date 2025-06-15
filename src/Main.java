public class Main {
    public static void main(String[] args) {
// Pojo implemented
        for  (int i = 1; i < 5; i++) {

            LPATeacher teacherobj = new LPATeacher(
                    "900" + i,
                    switch (i) {
                        case 1 -> "Mohan";
                        case 2 -> "Sathan";
                        case 3 -> "Nadan";
                        case 4 -> "Meena";
                        default -> "Unknown";
                    },
                    "1998-10-08",
                    "Java Masterclass"
            );

            System.out.println(teacherobj);
        }

        Teacher pojoTeacher = new Teacher("9001","Sahan","1979-12-01","Python masterclass");

        LPATeacher recordTeacher = new LPATeacher("9002","Amal","1963-12-01","C++ masterclass");

        System.out.println(pojoTeacher);

        System.out.println(recordTeacher);

        pojoTeacher.setClassList("Java OCP 829 Course");

        System.out.println(pojoTeacher.getName() + " is teaching " + pojoTeacher.getClassList());
        System.out.println(recordTeacher.name() + " is teaching " + recordTeacher.classList());



    }
}

