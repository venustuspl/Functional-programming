package pl.bykowski.functionalprogramming.lesson5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgrammingAttend {

    @Test
    public void lambdaExample() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> collect = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println("----------------");
        System.out.println(collect);

    }

}
