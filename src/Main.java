import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {task1();task2();task3();task4();}

    public static void task1() {
        System.out.println("Задача 1");

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };

        Predicate<Integer> predicate1 = integer -> {
            return integer > 0;
        };
        System.out.println(predicate.test(-1));
        System.out.println(predicate1.test(12));
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет, " + s);
            }
        };
        consumer.accept("Андрей");

        Consumer<String> consumer1 = s -> {
            System.out.println("Привет, " + s);
        };

        consumer1.accept("Валера");
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double, Long> function1 = aDouble -> {
            return Math.round(aDouble);
        };

        System.out.println(function.apply(2.35689515465464));
        System.out.println(function1.apply(5.3698446546543241));
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);

        System.out.println(supplier.get());
        System.out.println(supplier1.get());
        System.out.println();
    }
}
