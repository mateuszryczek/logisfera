package com.mime.logisfera;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import java.util.stream.IntStream;

class FirstTask {

    public static void main(String[] args) {
        List<Integer> integerList = FastReader.readLineOfIntegers();
        Supplier<IntStream> sortedDistinctNumbersSupplier = () -> integerList.parallelStream()
                .mapToInt(element -> element)
                .distinct()
                .sorted();

        sortedDistinctNumbersSupplier.get().forEachOrdered(element -> System.out.print(element + " "));
        System.out.println();
        System.out.println("count: " + integerList.size());
        System.out.println("distinct: " + sortedDistinctNumbersSupplier.get().count());
        System.out.println("min: " + sortedDistinctNumbersSupplier.get().min().orElseThrow(NoSuchElementException::new));
        System.out.println("max: " + sortedDistinctNumbersSupplier.get().max().orElseThrow(NoSuchElementException::new));

    }

}
