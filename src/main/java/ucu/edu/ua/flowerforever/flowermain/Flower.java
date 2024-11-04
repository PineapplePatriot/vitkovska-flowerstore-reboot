package ucu.edu.ua.flowerforever.flowermain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
public class Flower extends Item {
    @Id
    private int id;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
    }
    public String getColor() {
        return color.toString();
    }

    @Override
    public String getDescription() {
        return "A " + color + " " + flowerType + " flower";
    }

    public void setType(FlowerType newFlowerType) {
        this.flowerType = newFlowerType;
    }
    
    public FlowerType getType() {
        return this.flowerType;
    }    
}