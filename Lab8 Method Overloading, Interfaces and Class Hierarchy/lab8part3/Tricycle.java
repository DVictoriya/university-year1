public class Tricycle extends Transport implements RoadVehicle { //Tricycle inherits the instances of Transports and implements/overrides the RoadVehicle methods
    public Tricycle (String destination, int distanceKilometers){
        super(destination, distanceKilometers);
    }

    @Override
    public void reachRoadDestination() { //overriding the method Reach destination
        System.out.println("Reach destination by tricycle");
    }
}
