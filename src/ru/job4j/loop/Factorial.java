package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int start = 2; start <= n; start++) {
            rsl *= start;
        }
        return rsl;
    }
}