package jedzonko.animals;

import jedzonko.TypeOfFood;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    public void testFoodKind() {

        Dog dog = new Dog();

        List<TypeOfFood> foodKind = dog.getFoodKind();



        assertTrue(foodKind.contains(TypeOfFood.MIESO));

        assertTrue(foodKind.contains(TypeOfFood.MLEKO));
    }

}