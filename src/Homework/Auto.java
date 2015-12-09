package Homework;

public class Auto {
    protected int engine;
    protected int wheels;

    public Auto(int engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public int getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void goStraight() {
        System.out.println("Brrrm");
    }


}
