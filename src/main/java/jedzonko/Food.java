package jedzonko;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode

public class Food {

    private String foodDescription;
    private int quantity;
    private TypeOfFood typeOfFood;



}
