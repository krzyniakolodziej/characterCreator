package com.characterCreator.entities.character.color;

import java.util.Random;

public class RandomColor {
    public static String getRandomHex() {
        Random random = new Random();
        return Integer.toHexString(random.nextInt());
    }
}
