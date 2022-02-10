package com.numbers;

public class FloatsAreWeird {
    public static float fcounter(int n) {
        float num = 0;
        for(int i = 0; i < n; i++) {
            num += 1.0;
        }
        return num;
    }

    public static void main(String[] args) {
        float x = fcounter(100000000);
        System.out.format("x = %f\n", x);
    }
}
