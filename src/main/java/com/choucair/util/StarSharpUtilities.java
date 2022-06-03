package com.choucair.util;

import java.util.Random;

public class StarSharpUtilities {

    public static int RamdomNumber() {
        Random random = new Random();

        int value = random.nextInt(999 + 100) + 100;
        return value;
    }
}
