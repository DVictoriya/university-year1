public class Train extends Transport implements Refuelable{
    public Train(String destination, int distanceKilometers){ super(destination, distanceKilometers);}

    @Override
    public void fillFuelTank() {
        System.out.println(" Fill fuel tank with hydrogen");
    }
}

