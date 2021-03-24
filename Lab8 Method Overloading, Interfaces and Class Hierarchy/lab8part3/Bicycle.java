public class Bicycle extends Transport implements RoadVehicle { //Bicycle inherits the instances of Transports and implements/overrides the RoadVehicle methods
    public Bicycle (String destination, int distanceKilometers){
        super(destination, distanceKilometers);
    }

    @Override
    public void reachRoadDestination() {
        System.out.println("Reach destination by bicycle");
    }
}

