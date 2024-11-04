package ucu.edu.ua.flowerforever.decorators;

import ucu.edu.ua.flowerforever.flowermain.Item;

public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", wrapped in paper";
    }
}
