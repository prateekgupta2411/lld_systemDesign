package Follow_SRP;


public class Main {
    public static void main(String[] args) {
        // Create a Human object
        Human human = new Human("John", "Fair", 5000);

        // Calculate earnings
        EarningCalculator calculator = new EarningCalculator();
        int totalEarnings = calculator.calculateTotalEarnings(human, 12);
        System.out.println("Total Earnings: " + totalEarnings);

        // Print occupation details
        MenOccupationPrinter printer = new MenOccupationPrinter();
        printer.printMenOccupation(human);

        // Save to database
        DatabaseServer saver = new DatabaseServer();
        saver.saveToDB(human);
    }
}