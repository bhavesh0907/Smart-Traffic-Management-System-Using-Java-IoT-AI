import java.util.Random;

public class TrafficAnalyzer {
    private int vehicleCount;
    
    public void analyzeTraffic() {
        vehicleCount = new Random().nextInt(100);
        System.out.println("Traffic volume: " + vehicleCount + " vehicles");
    }
    
    public int getVehicleCount() {
        return vehicleCount;
    }
}
