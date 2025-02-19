package solid_principle.first_principle_SRP.Following_SRP;

public class MenOccupationPrinter {
    public void printMenOccupation(Human human) {
        System.out.println("Name: " + human.name);
        System.out.println("Color: " + human.color);
        System.out.println("Income: " + human.income);
    }
}
