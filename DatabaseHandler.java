import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {
    private List<Integer> trafficData = new ArrayList<>();
    
    public void storeTrafficData(int vehicleCount) {
        trafficData.add(vehicleCount);
        System.out.println("Traffic data stored in database.");
    }
}
