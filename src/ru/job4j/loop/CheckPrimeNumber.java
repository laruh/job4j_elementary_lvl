package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 1 || number == 0) return false;
        boolean prime = true;
        for (int checker = 2; checker < number; checker++) {
            if ((number % checker) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
