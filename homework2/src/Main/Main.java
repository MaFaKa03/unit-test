package Main;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyata", "Camry", 2014);
        car.testDrive();
        System.out.println(car.getSpeed());
    }
}