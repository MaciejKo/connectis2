package inheritance;

public class Auto {
    protected int noOfWheels;
    protected String color;
    protected int power;

    public void makeANoise() {
        System.out.println("Auto brum brum");
    }


    public Auto(int noOfWheels, String color, int power) {
        this.noOfWheels = noOfWheels;
        this.color = color;
        this.power = power;
    }


}
