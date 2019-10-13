package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassStudentTest {


    @Test
    public void testCreator(){

        //given
        ClassStudent classStudent = new ClassStudent();
        //when
        classStudent.setName("Witek");
        classStudent.setSurname("Chomik");
//        classStudent.setPesel("02070803628");
        classStudent.setSchoolName("Zamoj");
        classStudent.setSchoolClassNumber(5);
        //then

        assertEquals("Zamoj", classStudent.getSchoolName());
        assertEquals("Witek", classStudent.getName());
        assertEquals("Chomik", classStudent.getSurname());
        assertEquals("02070803628", classStudent.getPesel());
        assertEquals(5, classStudent.getSchoolClassNumber());

    }

}