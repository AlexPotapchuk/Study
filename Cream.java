package pack;

public class Cream extends Cosmetic{

    private double viscosity;
    private String smell;

    public double getViscosity() {
        return viscosity;
    }

    public void setViscosity(double viscosity) {
        this.viscosity = viscosity;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public Cream(String brand,int cost,boolean isNatural,int expirationDate, double viscosity, String smell) {
        super(brand, cost, isNatural, expirationDate);
        this.viscosity = viscosity;
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Cream{" +" brand= " + getBrand() + ", cost = " + getCost() + ", isNatural - " + isNatural() +
                ", expirationDate = " + getExpirationDate() +
                ", viscosity=" + viscosity +
                ", smell='" + smell + '\'' +
                '}';
    }
}
