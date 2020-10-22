package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left < right ? right : left;
        return  result;
    }

    public static void main(String[] args) {
        int maxValue = Max.max(16, 58);
        System.out.println(maxValue);
    }
}

