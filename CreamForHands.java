package pack;

public class CreamForHands extends Cream{
    private double soft;

    public double getSoft() {
        return soft;
    }

    public void setSoft(double soft) {
        this.soft = soft;
    }

    public CreamForHands(String brand, int cost, boolean isNatural, int expirationDate, double viscosity, String smell, double soft) {
        super(brand, cost, isNatural, expirationDate, viscosity, smell);
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "CreamForHands{" + "brand = " + getBrand() + ", cost = " + getCost() + ", isNatural = " + isNatural()+
                ", expirationDate = " + getExpirationDate() + ", viscosity = " + getViscosity() + ", smell = " + getSmell() +
                ", soft=" + soft +
                '}';
    }
}
