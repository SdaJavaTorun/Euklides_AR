package com.sda.EuklidesNWW;

public class Main {

    public static int nwd (int a, int b) {

        while (b != a ) {
            if (a>b) a = a-b;
            else b = b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        System.out.println("Wynik NWD: " + nwd(a,b));
    }
}
