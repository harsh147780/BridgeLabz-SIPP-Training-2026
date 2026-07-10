package Java.oops_practice.gcr_codebase.oops_practice_exercise;

class WaterBottle {
    String ownerName;
    int dailyTarget;

    WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    void displayBottleInfo() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Daily Target: " + dailyTarget + " ml");
        System.out.println();
    }

    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle("Rahul", 2500);
        WaterBottle b2 = new WaterBottle("Priya", 3000);

        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}
