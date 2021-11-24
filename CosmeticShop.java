package pack;

import java.util.ArrayList;

public class CosmeticShop {
    ArrayList<Cosmetic> shop = new ArrayList<>();
    public void addProduct(Cosmetic product){
        shop.add(product);
    }

    public void takeCream(ArrayList c){
        for(Object cos : c){
            if(cos instanceof Cream ){
                System.out.println(cos);
            }

        }
    }
    public void takeLipstick(ArrayList c) {
        for (Object cos : c) {
            if (cos instanceof Lipstick) {
                System.out.println(cos);
            }
        }
    }

    public void takePowder(ArrayList c){
        for(Object cos : c)
            if(cos instanceof Powder)
                System.out.println(cos);
    }

    public void takeCreamForHands(ArrayList c) {
        for (Object cos : c)
            if (cos instanceof CreamForHands)
                System.out.println(cos);
    }

    public void takeCreamForLegs(ArrayList c) {
        for (Object cos : c)
            if (cos instanceof CreamForLegs)
                System.out.println(cos);
    }

    public void takeHighlighter (ArrayList c) {
        for (Object cos : c)
            if (cos instanceof Highlighter)
                System.out.println(cos);
    }



    @Override
    public String toString() {
        return "CosmeticShop{" +
                "shop=" + shop +
                '}';
    }
}
