package pl.bykowski.functionalprogramming.lesson2;

import org.junit.jupiter.api.Test;
import pl.bykowski.functionalprogramming.lesson1.Student;

import java.util.function.Predicate;

public class FunctionalProgrammingThread {

    @Test
    public void classicThread() throws Exception {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });
        t1.start();
    }


    @Test
    public void functionalThread() throws Exception {

        Thread t1 = new Thread(() -> {
            System.out.println("Hello!");
            System.out.println("Hello!");
        }
        );
        t1.start();

        Thread t2 = new Thread(() -> System.out.println("Hello!"));
        t2.start();
    }

}
