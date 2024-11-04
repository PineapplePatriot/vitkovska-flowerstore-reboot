package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public class RibbonDecorator extends AbstractDecorator {
    private static final double RIBBON_COST = 40.0;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + RIBBON_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", decorated with a ribbon";
    }
}
