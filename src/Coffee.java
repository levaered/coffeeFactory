import java.util.ArrayList;
import java.util.List;

abstract class Coffee {
    String name;
    int countOfSugar;
    String typeOfCoffe;
    List<String> ingredients = new ArrayList<>();

    public String toString() {
        return name + " with " + countOfSugar + " sugar spoons" + "\n\n" + "Ingredients: " + ingredients + "\n\n" + "Made on the basis of " + typeOfCoffe + "\n\n";
    }
}
