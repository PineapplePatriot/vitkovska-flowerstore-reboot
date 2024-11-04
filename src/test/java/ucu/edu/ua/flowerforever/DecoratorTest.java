package ucu.edu.ua.flowerforever;

import ucu.edu.ua.flowerforever.flowermain.Flower;
import ucu.edu.ua.flowerforever.flowermain.FlowerType;
import ucu.edu.ua.flowerforever.flowermain.FlowerColor;
import ucu.edu.ua.flowerforever.flowermain.Item;
import ucu.edu.ua.flowerforever.decorators.PaperDecorator;
import ucu.edu.ua.flowerforever.decorators.BasketDecorator;
import ucu.edu.ua.flowerforever.decorators.RibbonDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void testPaperDecoratorPrice() {
        Flower originalFlower = new Flower();
        originalFlower.setPrice(45.0);
        originalFlower.setType(FlowerType.ROSE);
        originalFlower.setColor(FlowerColor.RED);

        Item paperDecoratedFlower = new PaperDecorator(originalFlower);
        double expectedPrice = originalFlower.getPrice() + 13.0;
        assertEquals(expectedPrice, paperDecoratedFlower.getPrice());
    }

    @Test
    public void testBasketDecoratorPrice() {
        Flower originalFlower = new Flower();
        originalFlower.setPrice(45.0);
        originalFlower.setType(FlowerType.TULIP);
        originalFlower.setColor(FlowerColor.BLUE);

        Item basketDecoratedFlower = new BasketDecorator(originalFlower);
        double expectedPrice = originalFlower.getPrice() + 4.0;
        assertEquals(expectedPrice, basketDecoratedFlower.getPrice());
    }

    @Test
    public void testRibbonDecoratorPrice() {
        Flower originalFlower = new Flower();
        originalFlower.setPrice(45.0);
        originalFlower.setType(FlowerType.CHAMOMILE);
        originalFlower.setColor(FlowerColor.GREEN);

        Item ribbonDecoratedFlower = new RibbonDecorator(originalFlower);
        double expectedPrice = originalFlower.getPrice() + 40.0;
        assertEquals(expectedPrice, ribbonDecoratedFlower.getPrice());
    }

    @Test
    public void testPaperDecoratorDescription() {
        Flower originalFlower = new Flower();
        originalFlower.setType(FlowerType.ROSE);
        originalFlower.setColor(FlowerColor.RED);

        Item paperDecoratedFlower = new PaperDecorator(originalFlower);
        String expectedDescription = "A " + originalFlower.getColor() + " " + originalFlower.getType() + " flower, wrapped in paper";
        assertEquals(expectedDescription, paperDecoratedFlower.getDescription());
    }

    @Test
    public void testBasketDecoratorDescription() {
        Flower originalFlower = new Flower();
        originalFlower.setType(FlowerType.TULIP);
        originalFlower.setColor(FlowerColor.BLUE);

        Item basketDecoratedFlower = new BasketDecorator(originalFlower);
        String expectedDescription = "A " + originalFlower.getColor() + " " + originalFlower.getType() + " flower, placed in a basket";
        assertEquals(expectedDescription, basketDecoratedFlower.getDescription());
    }

    @Test
    public void testRibbonDecoratorDescription() {
        Flower originalFlower = new Flower();
        originalFlower.setType(FlowerType.CHAMOMILE);
        originalFlower.setColor(FlowerColor.GREEN);

        Item ribbonDecoratedFlower = new RibbonDecorator(originalFlower);
        String expectedDescription = "A " + originalFlower.getColor() + " " + originalFlower.getType() + " flower, decorated with a ribbon";
        assertEquals(expectedDescription, ribbonDecoratedFlower.getDescription());
    }
}
