package com.hillel.dzhurynskyi.homework.hm18;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.hillel.dzhurynskyi.homework.hm18.FruitType.*;
import static com.hillel.dzhurynskyi.homework.hm18.Vitamin.*;

public class MainLambdaTemplateStudents {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();

        fruits.forEach(System.out::println);
        System.out.println("------------");
        System.out.println("Fruits with vitamins A or C");

        fruits.stream()
                .filter(fruit ->fruit.getVitamins().stream().anyMatch(vitamin -> A.equals(vitamin) || C.equals(vitamin)))
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("All vitamins without reiteration ");

        TreeSet<Vitamin> setVitamins = fruits.stream()
                .flatMap(fruit -> fruit.getVitamins().stream())
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(setVitamins);
        System.out.println("------------");
        System.out.println("The cheapest fruits ");

        Map<FruitType, Fruit> cheapestFruits = fruits.stream()
                .collect(Collectors.toMap(Fruit::getFruitType, Function.identity(), ((fruit, fruit2) -> fruit.getPrice() > fruit2.getPrice() ? fruit2 : fruit)));

        System.out.println(cheapestFruits);
        System.out.println("------------");
        System.out.println("3 fruits with max time storage");

        List<Fruit> fruitsList = fruits.stream()
                .sorted(Comparator.comparingInt(Fruit::getDayToLive).reversed())
                .limit(3)
                .toList();

        System.out.println(fruitsList);
        System.out.println("------------");
        System.out.println("Count all fruits by type");

        Map<FruitType, Long> f = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getFruitType, Collectors.counting()));

        System.out.println(f);
        System.out.println("------------");
        System.out.println("All fruits by type");

        Map<FruitType, List<Fruit>> mapFruits = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getFruitType));

        System.out.println(mapFruits);

    }
    private static List<Fruit> fillFruitsList() {
        List<Fruit> fruits = new ArrayList<>();

        Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
        fruit.setVitamins(List.of(A, C));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B1, B2, C));
        fruits.add(fruit);

        fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
        fruit.setVitamins(List.of(E, B, A));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
        fruit.setVitamins(List.of(A, C, D));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B, B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
        fruit.setVitamins(List.of(B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        return fruits;
    }
}
