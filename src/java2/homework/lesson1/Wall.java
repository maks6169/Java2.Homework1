package java2.homework.lesson1;

import java.util.Random;

public class Wall {
    public static void walls() {
        Random random = new Random();
        int[] walls = new int[10];

        for (int i = 0; i < 10; i++) {
            walls[i] = random.nextInt(10);
        }
    }
}
