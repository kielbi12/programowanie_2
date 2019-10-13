package jedzonko;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Pets> petsList = new ArrayList<>();
    private List<Food> foodList = new ArrayList<>();
    private List<TypeOfFood> foodToBuy = new ArrayList<>();


    public void addPet(Pets pets){

    }
    public void addFood(Food food){

    }

    public void removePet(Pets pets){

    }

    public void removeFood(Food food){

    }
    
    public void feedPet(){
        petsList.forEach(pets->{
            List<TypeOfFood> foodKind = pets.getFoodKind();
            Food food = foodList.stream().filter(b->foodKind.contains(b.getTypeOfFood())).findAny().orElse(null);
            if(food==null){
                System.out.println("Nie ma jedzenia dla Twojego zwierzaka!");
                foodToBuy.addAll(foodKind);
            }
            else{
                System.out.println("Zwierzak najedzony");
            }
        });
    }
}
