package InheritanceSubpart;

import javax.xml.namespace.QName;

public class Main extends Object {
    public static void main(String [] args){

        Student Max = new Student("Max",21);
        System.out.println(Max.toString());

        primarySchoolStudent Jimmy = new primarySchoolStudent("jimmy",8,"Carol");
        System.out.println(Jimmy);
    }


}

class Student{
    private String Name;
    private int Age;

    Student(String Name,int Age){
        this.Name = Name;
        this.Age = Age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return Name + " is " + Age;
//        return "Student{" +
//                "Name='" + Name + '\'' +
//                ", Age=" + Age +
//                '}';
    }
}

class primarySchoolStudent extends Student{

    private String parentName;

    primarySchoolStudent(String Name,int Age,String ParentName){
        super(Name,Age);
        this.parentName = ParentName;
    }

    @Override
    public String toString() {
        return parentName + " 's kid " + super.toString();
    }
}