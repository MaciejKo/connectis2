package inheritance;

public class SportCar extends Auto {

    public SportCar(int noOfWheels, String color, int power) {
        super(noOfWheels, color, power);
    }

    @Override
    public void makeANoise() {
        System.out.println("Sport car wrrrrrrr");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
