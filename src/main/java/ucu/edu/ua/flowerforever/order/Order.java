package ucu.edu.ua.flowerforever.order;

import java.util.LinkedList;
import lombok.ToString;
import ucu.edu.ua.flowerforever.delivery.Delivery;
import ucu.edu.ua.flowerforever.flowermain.Item;
import ucu.edu.ua.flowerforever.payment.Payment;

@ToString
public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment selectedpayment) {
        this.payment = selectedpayment;
    }
    public void setDeliveryStrategy(Delivery selecteddelivery) {
        this.delivery = selecteddelivery;
    }
    public void calculateTotalPrice() {
        double totalPrice = items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        System.out.println("Total price: $" + totalPrice);
    }

    public void processOrder() {
        System.out.println("Processing the order");
        payment.pay(getTotalPrice());
        delivery.deliver(items);
    }
    
    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
