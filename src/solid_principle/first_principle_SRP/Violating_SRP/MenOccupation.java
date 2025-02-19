package solid_principle.first_principle_SRP.Violating_SRP;

public class MenOccupation {
    Human human;
    int totalMonth;

    MenOccupation(Human h, int tm){
        this.human = h;
        this.totalMonth = tm;;
    }

    public int calculateTotalEarning(){
        // Calculate total Earning
        int Salary = human.income * this.totalMonth;
        return Salary;
    }

    public  void printMenOccupation(){
        // print MenOcc
        System.out.println("Name: " + human.name);
        System.out.println("Color: " + human.color);
        System.out.println("Income: " + human.income);
    }

    public void savetoDB(){
        // save into the db
        System.out.println("Saving " + human.name + " to the database.");
    }
}