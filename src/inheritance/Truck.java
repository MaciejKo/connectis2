package inheritance;

public class Truck extends Auto {

    private boolean hasTrailer;


    public Truck(int noOfWheels, String color, int power, boolean hasTrailer) {
        super(noOfWheels, color, power);
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void makeANoise() {
        System.out.println("Track WRUM WRUM");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "hasTrailer=" + hasTrailer +
                ", noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
