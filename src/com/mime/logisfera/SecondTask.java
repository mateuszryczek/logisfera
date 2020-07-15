package com.mime.logisfera;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class SecondTask {

    private static final int SUM = 13;

    public static void main(String[] args) {
        int[] inputNumbers = FastReader.readLineOfIntegers().parallelStream()
                .mapToInt(element -> element)
                .toArray();
        List<Pair> pairs = getPairs(inputNumbers);
        pairs.stream()
                .sorted()
                .forEach(System.out::println);
    }

    static List<Pair> getPairs(int[] inputNumbers) {
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = i + 1; j < inputNumbers.length; j++) {
                int a = inputNumbers[i];
                int b = inputNumbers[j];
                if ((a + b) == SUM) {
                    pairs.add(a < b ? new Pair(a, b) : new Pair(b, a));
                }
            }
        }

        return pairs;
    }

    private static class Pair implements Comparable<Pair> {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return a + " " + b;
        }

        @Override
        public int compareTo(Pair o) {
            return a - o.a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a &&
                    b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

}
