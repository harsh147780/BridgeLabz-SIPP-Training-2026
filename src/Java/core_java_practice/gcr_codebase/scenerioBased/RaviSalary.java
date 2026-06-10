package Java.core_java_practice.gcr_codebase.scenerioBased;



public class RaviSalary {
    static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        String rank = "Senior Member";
        double salary = 50000;
        float membershipFee = 1499.75f;

        // Calculating annual bonus (12% of salary)
        int annualBonus = (int) (salary * 0.12);

        // Formatted Welcome Card

        System.out.println("      WELCOME TO THE GUILD       ");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);

        System.out.println("Welcome, " + name + "! We are glad to have you.");

    }
}