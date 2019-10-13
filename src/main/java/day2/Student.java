package day2;


import day2.Validator.PESELValidator;
import lombok.Getter;

@Getter
public class Student {

    protected String name;
    protected String surname;
    protected String pesel;


    public Student(){

    }
    public Student (String name, String surname, String pesel){
        this.name=name;
        this.surname=surname;
//        this.pesel=pesel;
        setPesel(pesel);
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setPesel(String pesel) {
        PESELValidator validator = new PESELValidator();
        boolean validate = validator.validate(pesel);
        if (validate) {
            this.pesel = pesel;
        }
        else {
            throw new IllegalArgumentException("Niepoprawny PESEL!");
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
