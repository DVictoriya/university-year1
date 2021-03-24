public class JetPlane extends Transport implements Refuelable{
    public JetPlane(String destination, int distanceKilometers){ super(destination, distanceKilometers);}

    @Override
    public void fillFuelTank() {
        System.out.println(" Fill fuel tank with JP-1A(jet fuel)");
    }
}