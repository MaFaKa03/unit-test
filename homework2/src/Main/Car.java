package Main;

public class Car extends Vehicle{
    private String company;
    private String model;
    private int yearRelease;
    private int countWheels;
    private double speed;

    public Car(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.countWheels = 4;
        this.speed = 0;
    }
    public Car(){
        this.countWheels = 4;
        this.speed = 0;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels() {
        this.countWheels = 4;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = 0;
    }

    @Override
    public double testDrive() {
        speed = 60;
        return speed;
    }

    @Override
    public double park() {
        speed = 0;
        return speed;
    }

}
