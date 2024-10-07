import farm.animal;
import farm.duck;
import farm.fish;
import farm.pig;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<animal> animals = new ArrayList<>();

        // Khởi tạo các đối tượng động vật
        animal pig = new pig(false, true, "Piggy");
        animal fish = new fish(true, false, "Fishy");
        animal duck = new duck(true, true, "Ducky");

        animals.add(pig);
        animals.add(fish);
        animals.add(duck);

        for (animal a : animals) {
            if (a instanceof pig) {
                System.out.println(a + " is a pig");
            } else if (a instanceof duck) {
                System.out.println(a + " is a duck");
            } else if (a instanceof fish)
                System.out.println(a + " is a fish");
        }
    }
}

