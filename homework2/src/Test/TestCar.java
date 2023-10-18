
import Main.Car;
import Main.Motorcycle;
import Main.Vehicle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCar {
    @Test
    void testDriveForCar(){
        Car car = new Car("Toyata", "Camry", 2014);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60.0);
    }
    @Test
    void testDriveForMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Suzuki", "ares", 2000);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    void testInstanceOfVehicleForCar(){
        Car car = new Car();
        assertThat(car instanceof Vehicle).isEqualTo(true);
    }
    @Test
    void testCountWheelsCar(){
        Car car = new Car();

        assertThat(car.getCountWheels()).isEqualTo(4);
    }
    @Test
    void testCountWheelsMotorcycle(){
        Motorcycle motorcycle = new Motorcycle();
        assertThat(motorcycle.getCountWheels()).isEqualTo(2);
    }
    @Test
    void testParkForCar(){
        Car car = new Car();
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    void testParkForMotorcycle(){
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
