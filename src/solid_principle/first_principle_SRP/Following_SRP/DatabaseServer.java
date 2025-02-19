package solid_principle.first_principle_SRP.Following_SRP;

public class DatabaseServer {
    public void saveToDB(Human human) {
        // Code to save Human data into the database
        System.out.println("Saving " + human.name + " to the database.");
    }
}
