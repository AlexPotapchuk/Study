package pack;

public class Powder extends Cosmetic{

    private String color;
    private boolean isMatting;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMatting() {
        return isMatting;
    }

    public void setMatting(boolean matting) {
        isMatting = matting;
    }

    public Powder(String brand,int cost,boolean isNatural,int expirationDate,String color, boolean isMatting) {
        super(brand, cost, isNatural, expirationDate);
        this.color = color;
        this.isMatting = isMatting;
    }

    @Override
    public String toString() {
        return "Powder{" + "brand = " + getBrand() + ", cost = " + getCost() + ", isNatural = " + isNatural() +
                ", expirationDate = " + getExpirationDate() +
                "color='" + color + '\'' +
                ", isMatting=" + isMatting +
                '}';
    }
}
