package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public class PaperDecorator extends AbstractDecorator {
    private static final double PAPER_COST = 13.0;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + PAPER_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", wrapped in paper";
    }
}
