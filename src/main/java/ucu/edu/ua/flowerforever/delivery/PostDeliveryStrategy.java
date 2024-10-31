package ucu.edu.ua.flowerforever.delivery;

import java.util.List;
import ucu.edu.ua.flowerforever.flowermain.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via Post";
    }
}
