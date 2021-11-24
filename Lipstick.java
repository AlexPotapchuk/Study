package pack;

public class Lipstick extends Cosmetic{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Lipstick(String brand, int cost, boolean isNatural, int expirationDate, String color) {
        super(brand, cost, isNatural, expirationDate);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lipstick{" +"Brand = "+ getBrand() + ", cost = " + getCost() + ", isNatural = " + isNatural() +
                ", ExpirationDate = " + getExpirationDate() +
                ", color='" + color + '\'' +
                '}';
    }
}
