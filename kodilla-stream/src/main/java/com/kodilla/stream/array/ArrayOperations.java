package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .mapToObj(i -> numbers[i])
                .forEach(System.out::println);

        return java.util.Arrays.stream(numbers, 0, numbers.length)
                .average().orElse(0.0);

    }
}
