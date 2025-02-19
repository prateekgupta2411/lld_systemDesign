package solid_principle.first_principle_SRP.Following_SRP;


public class EarningCalculator {
    public int calculateTotalEarnings(Human human, int totalMonths) {
        return human.income * totalMonths;
    }
}
