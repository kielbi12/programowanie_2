package day2;

import lombok.Getter;

@Getter
public class ClassStudent extends SchoolStudent {

    private int schoolClassNumber;


    public ClassStudent(){

    }

    public ClassStudent(int schoolClassNumber, SchoolStudent schoolStudent){
        this.schoolClassNumber=schoolClassNumber;
        this.schoolName = schoolStudent.schoolName;
        this.name=schoolStudent.name;
        this.surname = schoolStudent.surname;
        this.pesel=schoolStudent.pesel;
    }

    public void setSchoolClassNumber(int schoolClassNumber) {
        this.schoolClassNumber = schoolClassNumber;
    }
}
