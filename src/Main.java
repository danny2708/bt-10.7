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

        System.out.println("Animals that can swim:");
        for (animal ani : animals) {
            if (ani.isCan_Swim()) {
                System.out.println(ani);
            }
        }

        System.out.println("\nAnimals that can walk:");
        for (animal ani : animals) {
            if (ani.isCan_Walk()) {
                System.out.println(ani);
            }
        }
    }
}
