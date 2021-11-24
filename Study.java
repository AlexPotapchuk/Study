package pack;

import java.util.*;

public class Study  {
    public static void main(String[] args){

        CosmeticShop cs = new CosmeticShop();
        Cream cream = new Cream("Nivea", 20,true,4,2.5,"Terrible");
        Cosmetic cosmetic = new Cosmetic("Belita",2,true,1);
        Cream cream2 = new Cream("CREMIK", 25, false, 10, 2.5, "Tasty");
        Lipstick lip = new Lipstick("SayWearAreGays", 69, false, 1, "White Blue");
        CreamForHands forHands = new CreamForHands("Rampage",5,false,99999,99999,"RRRAAAAMPAGE", 0);
        CreamForLegs forLegs = new CreamForLegs("Gai sen-sei", 8, false,8,10,"Young",0.1);

        cs.addProduct(cream);
        cs.addProduct(cosmetic);
        cs.addProduct(cream2);
        cs.addProduct(lip);
        cs.addProduct(forHands);
        cs.addProduct(forLegs);
        cs.takeCream(cs.shop);
        cs.takeLipstick(cs.shop);
        cs.takeCreamForHands(cs.shop);
        cs.takeCreamForLegs(cs.shop);

    }
}
