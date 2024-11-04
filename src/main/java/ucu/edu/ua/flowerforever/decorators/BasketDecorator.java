package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public class BasketDecorator extends AbstractDecorator {
    private static final double BASKET_COST = 4.0;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + BASKET_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", placed in a basket";
    }
}
