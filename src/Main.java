import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        coffeeFactory latteFactory = new latteFactory();
        coffeeFactory mochaFactory = new mochaFactory();

        Coffee latte = latteFactory.makeCoffee("Grains", 4);
        Coffee mocha = mochaFactory.makeCoffee("Ground coffee in a filter",2);

        System.out.println(latte);
        System.out.println(mocha);

    }
}

