package Java.oops_practice.gcr_codebase.oops_practice_exercise;

class Drone {
    int droneId;
    int batteryPercentage;
    static String companyName = "SkyLogistics";

    Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println("Drone " + droneId + " started delivery.");
        } else {
            System.out.println("Drone " + droneId + " has low battery.");
        }
    }

    void displayStatus() {
        System.out.println("Company: " + companyName);
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        Drone d1 = new Drone(101, 90);
        Drone d2 = new Drone(102, 45);
        Drone d3 = new Drone(103, 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}