public class Teacher {
    private String Id;
    private String Name;
    private String DateOfBirth;
    private String ClassList;

    public Teacher(String id, String name, String dateOfBirth, String classList) {
        Id = id;
        Name = name;
        DateOfBirth = dateOfBirth;
        ClassList = classList;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return ClassList;
    }

    public void setClassList(String classList) {
        ClassList = classList;
    }

    //overriding is essential.
    @Override
    public String toString() {
        return "Teacher{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Date Of Birth='" + DateOfBirth + '\'' +
                ", Class List='" + ClassList + '\'' +
                '}';
    }
}
