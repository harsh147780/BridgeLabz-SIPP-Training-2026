package Java.oops_practice.gcr_codebase.oops_practice_exercise.scenerioBased;

class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println(vehicleNumber + " " + ownerName + " " + vehicleType);
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("UP01A1", "Rahul", "Car"),
                new Vehicle("UP01A2", "Amit", "Bike"),
                new Vehicle("UP01A3", "Riya", "Car"),
                new Vehicle("UP01A4", "Karan", "Bike"),
                new Vehicle("UP01A5", "Anjali", "Car"),
                new Vehicle("UP01A6", "Neha", "Bike"),
                new Vehicle("UP01A7", "Vikas", "Car"),
                new Vehicle("UP01A8", "Rohan", "Bike"),
                new Vehicle("UP01A9", "Priya", "Car"),
                new Vehicle("UP01A10", "Sonia", "Bike")
        };

        displayCars(vehicles);
        System.out.println();
        displayBikes(vehicles);
    }
}
