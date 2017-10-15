package inheritance;

public class Main {

    public static void main(String[] args) {
        Auto sportCar = new SportCar(4, "BLUE", 400);
        Auto truck = new Truck(16, "RED", 600, false);
        System.out.println(sportCar);
        System.out.println(truck);

        sportCar.makeANoise();
        truck.makeANoise();
    }





}
