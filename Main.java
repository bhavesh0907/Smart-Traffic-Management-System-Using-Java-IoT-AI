public class Main {
    public static void main(String[] args) {
        TrafficAnalyzer analyzer = new TrafficAnalyzer();
        SensorIntegration sensors = new SensorIntegration();
        AI_TrafficControl aiControl = new AI_TrafficControl();

        sensors.collectTrafficData();
        analyzer.analyzeTraffic();
        aiControl.optimizeTrafficFlow();
    }
}
