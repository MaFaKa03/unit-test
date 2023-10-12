public class Calculator {
    private double price;
    private double discount;

    public Calculator(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }
    public Calculator(){}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculatorDiscount(){
        assert price - ((price * discount) / 100) < price: "ArithmeticException";
        return price - ((price * discount) / 100);

    }
}
