package ucu.edu.ua.flowerforever.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
