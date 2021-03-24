 abstract class Transport { // abstract class from which all classes should inherit
    String destination;
    int distanceKilometers;

    public Transport(String destination, int distanceKilometers){
        this.destination= destination;
        this.distanceKilometers = distanceKilometers;
    }
    public String getTransport(){
        return destination;
    }
    public int getDistanceKilometers(){
        return distanceKilometers;
    }

    }


