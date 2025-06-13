public class Main {
    public static void main(String[] args) {

        for  (int i = 1; i < 5; i++) {

            Teacher teacherobj = new Teacher(
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



    }
}

