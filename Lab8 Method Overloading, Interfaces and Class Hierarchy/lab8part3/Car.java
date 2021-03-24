public class Car extends Transport implements RoadVehicle, Refuelable{ //Car inherits the instances of Transports and implements/overrides
                                                            // the RoadVehicle methods and Refuelable methods.
    public Car (String destination, int distanceKilometers){
        super(destination, distanceKilometers);
    }

    @Override
    public void reachRoadDestination() {
        System.out.println("Reaching destination by car");
    }

    @Override
    public void fillFuelTank() {
        System.out.println("Fill fuel tank with diesel");
    }
}

