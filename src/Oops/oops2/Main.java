package Oops.oops2;

public class Main {
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.add(10, 20)); // Output: 30
        System.out.println(obj.add(10.5, 20.5)); // Output: 31.0
    }
}
