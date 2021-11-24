package pack;

public class Highlighter extends Powder{
    private double shine;


    public Highlighter(String brand, int cost, boolean isNatural, int expirationDate, String color, boolean isMatting,double shine) {
        super(brand, cost, isNatural, expirationDate, color, isMatting);
        this.shine = shine;
    }

    public double getShine() {
        return shine;
    }

    public void setShine(double shine) {
        this.shine = shine;
    }

    @Override
    public String toString() {
        return "Highlighter{" + ", brand = " + getBrand()+ ", cost = " + getCost() + ", isNatural = " + isNatural() +
                ", expirationDate = " + getExpirationDate() + ", color = " + getColor() + ", isMatting = " + isMatting()+
                ", shine = " + shine +
                '}';
    }
}
