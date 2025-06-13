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
