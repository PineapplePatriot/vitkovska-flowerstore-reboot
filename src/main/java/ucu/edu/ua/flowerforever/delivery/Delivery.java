package ucu.edu.ua.flowerforever.delivery;

import ucu.edu.ua.flowerforever.flowermain.Item;
import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
