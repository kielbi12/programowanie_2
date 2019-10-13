package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolStudentTest {


    @Test
    public void testConstructor() {
        //given
        SchoolStudent schoolStudent = new SchoolStudent();
        //when
        schoolStudent.setName("Witek");
        schoolStudent.setSurname("Chomik");
//        schoolStudent.setPesel("02070803628");
        schoolStudent.setSchoolName("Zamoj");
        //then

        assertEquals("Zamoj", schoolStudent.getSchoolName());
        assertEquals("Witek", schoolStudent.getName());
        assertEquals("Chomik", schoolStudent.getSurname());
        assertEquals("02070803628", schoolStudent.getPesel());
    }


}