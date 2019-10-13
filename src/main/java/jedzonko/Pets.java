package jedzonko;

import java.util.List;

public interface Pets {

    void introduce();
    void getVoice();
    List<TypeOfFood> getFoodKind();
    void feed(Food food);
    void entertainMe();

}
