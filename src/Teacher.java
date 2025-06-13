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

    @Override
    public String toString() {
        return "Teacher{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", ClassList='" + ClassList + '\'' +
                '}';
    }
}
