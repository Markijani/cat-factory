package us.kvitko.catfactoryapp.model.service;

import us.kvitko.catfactoryapp.model.entity.AnimalFactory;
import us.kvitko.catfactoryapp.model.entity.Cat;
import us.kvitko.catfactoryapp.model.entity.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class CatService {

    AnimalFactory animalFactory = AnimalFactory.getInstance();
    ArrayList<Cat> cats = new ArrayList<>();

        public Cat createCat() {
            Random random = new Random();
            int age = random.nextInt(15);
            double weight;
            do {
                weight = (int) (random.nextDouble() * 10);
            } while (weight == 0);
            Color color = Color.values()[random.nextInt(Color.values().length)];
            return new Cat(age, weight, color);
        }

        public void compareCat() {
            for (int i = 0; i < 10; i++) {
                cats.add(createCat());
            }
            System.out.println("The list of cats:");
            for (Cat cat : cats) {
                System.out.println(cat);
            }
            cats.sort((o1, o2) -> Integer.compare(o1.getColor().getPopularity(), o2.getColor().getPopularity()));
            System.out.println("The sorted list of cats:");
            for (Cat cat : cats) {
                System.out.println(cat);
            }
        }
}
