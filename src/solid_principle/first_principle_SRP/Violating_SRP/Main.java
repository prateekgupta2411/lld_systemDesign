package solid_principle.first_principle_SRP.Violating_SRP;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Prateek", "white", 5100000);

        MenOccupation mo = new MenOccupation(h,12);
        int totalEarnings = mo.calculateTotalEarning();
        System.out.println("Total Earnings for " + h.name + " over " + mo.totalMonth + " months: ₹" + totalEarnings);

        mo.printMenOccupation();

        mo.savetoDB();
    }
}
