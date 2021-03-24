public class Cycle extends Transport implements RoadVehicle { //Cycle inherits the instances of Transports and implements/overrides the RoadVehicle methods
    public Cycle (String destination, int distanceKilometers){
        super(destination, distanceKilometers);
    }

    @Override
    public void reachRoadDestination() {
        System.out.println("Reach destination by cycle");
    }
}
