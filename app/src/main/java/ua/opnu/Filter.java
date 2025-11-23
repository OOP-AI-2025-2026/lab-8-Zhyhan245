package ua.opnu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class Filter {

    public static <T> T[] filter(T[] input, Predicate<T> p) {

        T[] result = (T[]) Array.newInstance(
                input.getClass().getComponentType(),
                input.length
        );

        int counter = 0;
        for (T element : input) {
            if (p.test(element)) {
                result[counter++] = element;
            }
        }

        return Arrays.copyOf(result, counter);
    }

}