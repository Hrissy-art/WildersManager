public class Hangar {
    public static void main(String[] args) {
        Car newCar = new Car ("Clio", 600);
        Boat newBoat = new Boat("Titanic", 39);

        System.out.println(newCar.doStuff());
        System.out.println(newBoat.doStuff());
    }
}