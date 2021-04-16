package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int checker = 2; checker < number; checker++) {
            if ((number % checker) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
