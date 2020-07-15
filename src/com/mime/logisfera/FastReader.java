package com.mime.logisfera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class FastReader {

    private static BufferedReader reader = (new BufferedReader(new InputStreamReader(System.in)));
    private static StringTokenizer tokenizer = new StringTokenizer("");

    private FastReader() {}

    static String next() {
        while (!tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tokenizer.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static List<Integer> readLineOfIntegers() {
        try {
            tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> integerList = new ArrayList<>();
        while (tokenizer.hasMoreElements()) {
            integerList.add(Integer.parseInt(tokenizer.nextToken()));
        }
        return integerList;
    }
}
