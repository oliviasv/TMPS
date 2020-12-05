package BDP.client;

import BDP.domain.FreshJuice;
import BDP.domain.Item;
import BDP.domain.OrangeJuice;
import BDP.utilities.AbstractFactory.FruitFactory;
import BDP.utilities.AbstractFactory.ItemFactory;
import BDP.utilities.AbstractFactory.VegetableFactory;
import BDP.utilities.Adapter.FreshJuiceAdapter;
import BDP.utilities.Facade.ItemFacade;
import BDP.utilities.Strategy.DiscountCardCondition;
import BDP.utilities.Strategy.GoldDiscountCard;
import BDP.utilities.Strategy.SilverDiscountCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_YELLOW = "\u001B[33m";
        System.out.println(ANSI_GREEN + "\nHello, welcome to our store. Do you have a discount card? (yes/no)");
        label:
        while (true) {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            String discount = input.readLine();
            if(discount.length() == 0)
                break;
            switch (discount) {
                case "no" -> {
                    System.out.println(ANSI_CYAN+ "No problem. On the 5th purchase you'll receive a silver card, and on the 10th - a gold one.\n" +
                            "\nWhat do you want to buy?\n" + "* fruit+'xmas-bonus'(RawCandyBar/CoconutAlmonds)\n* vegetables+'xmas-bonus'(RawCandyBar/CoconutAlmonds)\n* fresh-juice\n");
                    String productType = input.readLine();
                    if (productType.length() == 0)
                        break;
                    switch (productType) {
                        case "fruit+RawCandyBar" -> {
                            ItemFactory fruitFactory = FruitFactory.getFruitFactory();
                            ItemFacade candyCustomizer = new ItemFacade(fruitFactory);
                            System.out.println(candyCustomizer.prepareCustomProduct(ANSI_YELLOW + "Oranges", "RawCandyBar", 20));
                            System.out.println(candyCustomizer.prepareCustomProduct(ANSI_YELLOW + "Apples", "RawCandyBar", 10));
                            System.out.println(candyCustomizer.prepareCustomProduct(ANSI_YELLOW + "Pears", "RawCandyBar", 25));
                        }
                        case "fruit+CoconutAlmonds" -> {
                            ItemFactory fruitFactory1 = FruitFactory.getFruitFactory();
                            ItemFacade almondsCustomizer = new ItemFacade(fruitFactory1);
                            System.out.println(almondsCustomizer.prepareCustomProduct(ANSI_YELLOW + "Oranges", "CoconutAlmonds", 20));
                            System.out.println(almondsCustomizer.prepareCustomProduct(ANSI_YELLOW + "Apples", "CoconutAlmonds", 10));
                            System.out.println(almondsCustomizer.prepareCustomProduct(ANSI_YELLOW + "Pears", "CoconutAlmonds", 25));
                        }
                        case "vegetables+RawCandyBar" -> {
                            ItemFactory vegetableFactory = VegetableFactory.getVegetableFactory();
                            ItemFacade candyCustomizer1 = new ItemFacade(vegetableFactory);
                            System.out.println(candyCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Carrots", "RawCandyBar", 12));
                            System.out.println(candyCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Garlic", "RawCandyBar", 15));
                            System.out.println(candyCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Onion", "RawCandyBar", 5));
                            System.out.println(candyCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Potatoes", "RawCandyBar", 8));
                        }
                        case "vegetables+CoconutAlmonds" -> {
                            ItemFactory vegetableFactory1 = VegetableFactory.getVegetableFactory();
                            ItemFacade almondsCustomizer1 = new ItemFacade(vegetableFactory1);
                            System.out.println(almondsCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Carrots", "CoconutAlmonds", 12));
                            System.out.println(almondsCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Garlic", "CoconutAlmonds", 15));
                            System.out.println(almondsCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Onion", "CoconutAlmonds", 5));
                            System.out.println(almondsCustomizer1.prepareCustomProduct(ANSI_YELLOW + "Potatoes", "CoconutAlmonds", 8));
                        }
                        case "fresh-juice" -> {
                            FreshJuice orangeJuice = new OrangeJuice();
                            Item adaptedJuice = new FreshJuiceAdapter(orangeJuice);
                            System.out.println(adaptedJuice.toString());
                        }
                        default -> {
                            System.out.println(ANSI_RED + "Ops, we don't have this item. Try another");
                        }
                    }


                }
                case "yes" -> {
                    System.out.println(ANSI_CYAN + "What type of Discount Card do you have? (silver/gold)");
                    String discountType = input.readLine();
                    if (discountType.length() == 0)
                        break;
                    switch (discountType) {
                        case "silver" -> {
                            DiscountCardCondition silverCardDiscount = new DiscountCardCondition(new SilverDiscountCard());
                            ItemFactory silverVegetableFactory = VegetableFactory.getVegetableFactory();
                            ItemFactory silverFruitFactory = FruitFactory.getFruitFactory();
                            Item orange = silverFruitFactory.prepareForSale("Oranges");
                            System.out.println(orange.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for oranges:" + silverCardDiscount.setNewPrice(orange.getPrice()) + "\n");
                            Item apple = silverFruitFactory.prepareForSale("Apples");
                            System.out.println(apple.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for apples:" + silverCardDiscount.setNewPrice(apple.getPrice()) + "\n");
                            Item pear = silverFruitFactory.prepareForSale("Pears");
                            System.out.println(pear.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for pears:" + silverCardDiscount.setNewPrice(pear.getPrice()) + "\n");
                            Item carrot = silverVegetableFactory.prepareForSale("Carrots");
                            System.out.println(carrot.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for pears:" + silverCardDiscount.setNewPrice(carrot.getPrice()) + "\n");
                            Item garlic = silverVegetableFactory.prepareForSale("Garlic");
                            System.out.println(garlic.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for pears:" + silverCardDiscount.setNewPrice(garlic.getPrice()) + "\n");
                            Item onion = silverVegetableFactory.prepareForSale("Onion");
                            System.out.println(onion.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for pears:" + silverCardDiscount.setNewPrice(onion.getPrice()) + "\n");
                            Item potato = silverVegetableFactory.prepareForSale("Potatoes");
                            System.out.println(potato.toString());
                            System.out.println(ANSI_YELLOW + "Silver discount price for pears:" + silverCardDiscount.setNewPrice(potato.getPrice()) + "\n");
                        }
                        case  "gold" -> {
                            DiscountCardCondition goldCardDiscount = new DiscountCardCondition(new GoldDiscountCard());
                            ItemFactory goldVegetableFactory = VegetableFactory.getVegetableFactory();
                            ItemFactory goldFruitFactory = FruitFactory.getFruitFactory();
                            Item orange = goldFruitFactory.prepareForSale("Oranges");
                            System.out.println(orange.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for oranges:" + goldCardDiscount.setNewPrice(orange.getPrice()) + "\n");
                            Item apple = goldFruitFactory.prepareForSale("Apples");
                            System.out.println(apple.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for apples:" + goldCardDiscount.setNewPrice(apple.getPrice()) + "\n");
                            Item pear = goldFruitFactory.prepareForSale("Pears");
                            System.out.println(pear.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for pears:" + goldCardDiscount.setNewPrice(pear.getPrice()) + "\n");
                            Item carrot = goldVegetableFactory.prepareForSale("Carrots");
                            System.out.println(carrot.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for pears:" + goldCardDiscount.setNewPrice(carrot.getPrice()) + "\n");
                            Item garlic = goldVegetableFactory.prepareForSale("Garlic");
                            System.out.println(garlic.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for pears:" + goldCardDiscount.setNewPrice(garlic.getPrice()) + "\n");
                            Item onion = goldVegetableFactory.prepareForSale("Onion");
                            System.out.println(onion.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for pears:" + goldCardDiscount.setNewPrice(onion.getPrice()) + "\n");
                            Item potato = goldVegetableFactory.prepareForSale("Potatoes");
                            System.out.println(potato.toString());
                            System.out.println(ANSI_YELLOW + "Gold discount price for pears:" + goldCardDiscount.setNewPrice(potato.getPrice()) + "\n");
                        }
                        default -> {
                            System.out.println(ANSI_RED + "Ops, we don't have this item. Try another)");
                        }
                    }
                }
            }
        }

    }
}
