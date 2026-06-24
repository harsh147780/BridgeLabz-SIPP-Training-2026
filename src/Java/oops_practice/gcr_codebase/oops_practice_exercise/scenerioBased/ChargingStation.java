package Java.oops_practice.gcr_codebase.oops_practice_exercise.scenerioBased;

class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 8.5;

    int stationId;
    double unitsConsumed;

    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }

    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation(1, 120);
        ChargingStation s2 = new ChargingStation(2, 180);
        ChargingStation s3 = new ChargingStation(3, 200);
        ChargingStation s4 = new ChargingStation(4, 250);
        ChargingStation s5 = new ChargingStation(5, 300);

        electricityRate = 9.0;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);
    }
}
