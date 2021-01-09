package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = n;
        if (n <= 1) return 1;
        else {
            for (int start = 1; start < n; start++) {
                rsl *= start;
            }
            return rsl;
        }
    }
}
