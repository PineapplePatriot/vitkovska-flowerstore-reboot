package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public abstract class AbstractDecorator extends Item {
    private Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
