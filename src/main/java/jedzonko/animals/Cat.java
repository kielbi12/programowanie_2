package jedzonko.animals;

import jedzonko.Food;
import jedzonko.Pets;
import jedzonko.TypeOfFood;

import java.util.Arrays;
import java.util.List;

public class Cat implements Pets {

    private final List<TypeOfFood> foodList = Arrays.asList(TypeOfFood.MIESO, TypeOfFood.MYSZY,TypeOfFood.KARMA_DLA_KOTA, TypeOfFood.SARDYNKI, TypeOfFood.MLEKO);

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
