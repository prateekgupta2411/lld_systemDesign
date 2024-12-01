package Not_SRP;

//Your provided code does not fully follow the Single Responsibility Principle (SRP)
// because the MenOccupation class is handling multiple responsibilities. Let's analyze why:
//Responsibilities in MenOccupation Class
//
//Calculating Total Earnings
//Method: calculateTotalEarning()
//This handles the calculation of total earnings, which is one responsibility.
//
//Printing Occupation Details
//Method: printMenOccupation()
//This is responsible for displaying information, a separate responsibility.
//
//Saving Data to the Database
//Method: savetoDB()
//This is responsible for persistence, which is yet another distinct responsibility.
//
//Why This Violates SRP?
//
//According to SRP, a class should have only one reason to change. In your case:
//
//If calculation logic changes, MenOccupation needs to be updated.
//If the print format changes, MenOccupation needs to be updated.
//If database logic changes, again, the same class needs modification.
//
//This leads to tight coupling and reduced maintainability.
public class MenOccupation {
    Human human;
    int totalMonth;

    MenOccupation(Human h, int tm){
        this.human = h;
        this.totalMonth = tm;;
    }

    public int calculateTotalEarning(){
        int Salary = human.income * this.totalMonth;
        return Salary;
    }

    public  void printMenOccupation(){
        // print MenOcc
    }

    public void savetoDB(){
        // save into the db
    }
}