package ucu.edu.ua.flowerforever.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
