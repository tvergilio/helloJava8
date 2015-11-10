import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> List<T> filterList(List<T> inventory, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T type : inventory) {
            if (predicate.test(type))    {
                result.add(type);
            }
        }
        return result;
    }

    public static <T> void prettyPrint(List<T> inventory, PrintPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T type : inventory) {
            System.out.println(predicate.prettyPrint(type));
        }
    }

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple("red", 150));
        inventory.add(new Apple("green", 200));
        inventory.add(new Apple("red", 210));
        List<Integer> integers = new ArrayList<>();

        for (Integer i = 0; i < 20; i++) {
            integers.add(i);
        }

        List<Apple> redApples = filterList(inventory, (Apple apple) -> "red".equals(apple.getColour()));
        List<Apple> heavyApples = filterList(inventory, (Apple apple) -> 150 < apple.getWeight());
        List<Integer> oneDigit = filterList(integers, (Integer i) -> 10 > i);

        prettyPrint(redApples, (Apple apple) -> "This apple's weight is " + apple.getWeight());
        prettyPrint(redApples, (Apple apple) -> "This apple is ".concat(150 < apple.getWeight() ? "heavy" : "light"));
        prettyPrint(oneDigit, (Integer integer) -> "This number is " + integer);
    }
}
