package pack;

public class Cosmetic {
    private String brand;
    private int cost;
    private boolean isNatural;
    private int expirationDate;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isNatural() {
        return isNatural;
    }

    public void setNatural(boolean natural) {
        isNatural = natural;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
    public Cosmetic(String brand, int cost, boolean isNatural, int expirationDate) {
        this.brand = brand;
        this.cost = cost;
        this.isNatural = isNatural;
        this.expirationDate = expirationDate;
    }

    public void instruction(){
        System.out.println("Instruction!");
    }

    public void utilisation(){
        System.out.println("Utilisation");
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", isNatural=" + isNatural +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
