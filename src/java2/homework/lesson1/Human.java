package java2.homework.lesson1;

import java.util.Random;

public class Human implements Running, Jumping {
    private int maxJumpHeight;
    private int maxRunLength;
    Random random = new Random();


    @Override
    public void jumping(int jumpHeight) {
        System.out.println("Human  jump " + jumpHeight);
    }

    @Override
    public void running(int runLength) {
        System.out.println("Human  run " + runLength);
    }

    public static void human(int maxJumpHeight, int maxRunLength) {

        Human[] human = new Human[5];
        for (int i = 0; i < 5; i++) {
            human[i] = new Human();
            for (int a = 0; a < 10; a++) {
                if (maxRunLength >= RunningTrack.runningTrack()) {
                    System.out.printf("Human %s run %s ", i, RunningTrack.runningTrack());
                    System.out.println();
                } else {
                    System.out.printf("Human %s fall", i);
                    System.out.println();
                    break;
                }

            }

        }
    }
}
