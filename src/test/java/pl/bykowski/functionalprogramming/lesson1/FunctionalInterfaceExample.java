package pl.bykowski.functionalprogramming.lesson1;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    @Test
    public void funcion() {
        Function<Integer, String> function = t -> t + t + " bykowski.pl";
        System.out.println(function.apply(11));
    }

    @Test
    public void predicate() {
        Predicate<Student> predicate = p -> p.getAge() > 21;

        boolean test1 = predicate.test(new Student("Przemek", "Bykowski", 34));
        boolean test2 = predicate.test(new Student("Karolina", "Nowak", 20));

        System.out.println(test1);
        System.out.println(test2);
    }
}
