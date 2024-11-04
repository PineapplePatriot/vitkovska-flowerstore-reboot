package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", placed in a basket";
    }
}
