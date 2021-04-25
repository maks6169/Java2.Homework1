package java2.homework.lesson1;

public class Robot implements Running, Jumping{
    @Override
    public void jumping(int jumpHeight) {
        System.out.println("Robot jump " + jumpHeight);
    }

    @Override
    public void running(int runLength) {
        System.out.println("Robot  run " + runLength);
    }
}
