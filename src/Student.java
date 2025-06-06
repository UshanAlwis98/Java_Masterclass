public class Student {

    private String studentId;
    private String name;
    private double grade = 50;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {

        if(grade > 100.0 || grade < 0.0)
        {
            System.out.println("Outside the range");
        }

        else
        {
            this.grade = grade;
        }
    }
}
