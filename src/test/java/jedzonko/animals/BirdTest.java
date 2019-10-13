package jedzonko.animals;

import jedzonko.TypeOfFood;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    @Test
    public void testFoodKind(){
        Bird bird = new Bird();

        List<TypeOfFood> foodKind = bird.getFoodKind();

        assertTrue(foodKind.contains(TypeOfFood.ZBOZE));
        assertTrue(foodKind.contains(TypeOfFood.MYSZY));
    }

}