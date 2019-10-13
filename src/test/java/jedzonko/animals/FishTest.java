package jedzonko.animals;

import jedzonko.TypeOfFood;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    @Test
    public void testFoodKind() {

        Fish fish = new Fish();

        List<TypeOfFood> foodKind = fish.getFoodKind();

        assertTrue(foodKind.contains(TypeOfFood.KARMA_DLA_RYBY));
    }
}