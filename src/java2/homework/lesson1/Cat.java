package java2.homework.lesson1;

public class Cat implements Running, Jumping {
    @Override
    public void jumping(int jumpHeight) {
        System.out.println("Cat jump " + jumpHeight);
    }

    @Override
    public void running(int runLength) {
        System.out.println("Cat  run " + runLength);
    }
}
