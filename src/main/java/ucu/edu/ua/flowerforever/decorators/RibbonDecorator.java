package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public class RibbonDecorator extends AbstractDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", decorated with a ribbon";
    }
}
