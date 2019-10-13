package jedzonko.animals;

import jedzonko.Food;
import jedzonko.Pets;
import jedzonko.TypeOfFood;

import java.util.Arrays;
import java.util.List;

public class Bird implements Pets {

    private final List<TypeOfFood> foodList = Arrays.asList(TypeOfFood.ZBOZE, TypeOfFood.MYSZY);

    @Override
    public void introduce() {

    }

    @Override
    public void getVoice() {

    }

    @Override
    public List<TypeOfFood> getFoodKind() {


        return foodList;
    }

    @Override
    public void feed(Food food) {

    }

    @Override
    public void entertainMe() {

    }
}


