package jedzonko.animals;

import jedzonko.TypeOfFood;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void testFoodKind() {

        Cat cat = new Cat();

        List<TypeOfFood> foodKind = cat.getFoodKind();

        assertTrue(foodKind.contains(TypeOfFood.KARMA_DLA_KOTA));
        assertTrue(foodKind.contains(TypeOfFood.MYSZY));
        assertTrue(foodKind.contains(TypeOfFood.MIESO));
        assertTrue(foodKind.contains(TypeOfFood.SARDYNKI));
        assertTrue(foodKind.contains(TypeOfFood.MLEKO));
    }

}