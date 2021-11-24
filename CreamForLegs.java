package pack;

public class CreamForLegs extends Cream {
    private double soft;

    public double getSoft() {
        return soft;
    }

    public void setSoft(double soft) {
        this.soft = soft;
    }

    public CreamForLegs(String brand, int cost, boolean isNatural, int expirationDate, double viscosity, String smell, double soft) {
        super(brand, cost, isNatural, expirationDate, viscosity, smell);
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "CreamForLegs{" + "brand = " + getBrand() + ", cost = " + getCost() + ", isNatural = " + isNatural() +
                 ", expirationDate = " + getExpirationDate() + ", viscosity = " + getViscosity() + ", smell = " + getSmell() +
                ", soft = " + soft +
                '}';
    }
}


