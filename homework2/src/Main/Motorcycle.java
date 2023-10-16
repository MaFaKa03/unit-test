package Main;

public class Motorcycle extends Vehicle{
    private String company;
    private String model;
    private int yearRelease;
    private double speed;
    private int countWheels;

    public Motorcycle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.speed = 0;
        this.countWheels = 2;
    }
    public Motorcycle(){
        this.countWheels = 2;
        this.speed = 0;}

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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = 0;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels() {
        this.countWheels = 2;
    }

    @Override
    public double testDrive() {
        speed = 75;
        return speed;
    }

    @Override
    public double park() {
        speed = 0;
        return speed;
    }
}
