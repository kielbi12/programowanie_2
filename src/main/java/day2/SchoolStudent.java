package day2;

import lombok.Getter;

@Getter

public class SchoolStudent extends Student {

    protected String schoolName;



    public SchoolStudent(){

    }
    public SchoolStudent(String schoolName, Student student){
        this.schoolName = schoolName;
        this.name=student.name;
        this.surname = student.surname;
        this.pesel=student.pesel;
    }
    public SchoolStudent(SchoolStudent schoolStudent){
        this.schoolName = schoolStudent.schoolName;
        this.name=schoolStudent.name;
        this.surname = schoolStudent.surname;
        this.pesel=schoolStudent.pesel;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
