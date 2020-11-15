package SDP;

import SDP.Category.FreshJuice;
import SDP.Category.Item;
import SDP.Category.OrangeJuice;
import SDP.Patterns.FreshJuiceAdapter;
import SDP.Patterns.ItemFacade;
import SDP.Patterns.AbstractFactory.ItemFactory;
import SDP.Patterns.AbstractFactory.FruitFactory;
import SDP.Patterns.AbstractFactory.VegetableFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nWhat do you want to buy?\n" +
                "* fruit+'xmas-bonus'(RawCandyBar/CoconutAlmonds)\n* vegetables+'xmas-bonus'(RawCandyBar/CoconutAlmonds)\n* fresh-juice\n");
        label:
        while (true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n See what we have:");
            String type = input.readLine();
            if (type.length() == 0)
                break;

            switch (type) {
                case "fruit+RawCandyBar":
                    ItemFactory fruitFactory = FruitFactory.getFruitFactory();
                    ItemFacade candyCustomizer = new ItemFacade(fruitFactory);
                    System.out.println(candyCustomizer.prepareCustomProduct("Oranges", "RawCandyBar", 20));
                    System.out.println(candyCustomizer.prepareCustomProduct("Apples", "RawCandyBar", 10));
                    System.out.println(candyCustomizer.prepareCustomProduct("Pears", "RawCandyBar", 25));
                    break;
                case "fruit+CoconutAlmonds":
                    ItemFactory fruitFactory1 = FruitFactory.getFruitFactory();
                    ItemFacade almondsCustomizer = new ItemFacade(fruitFactory1);
                    System.out.println(almondsCustomizer.prepareCustomProduct("Oranges", "CoconutAlmonds", 20));
                    System.out.println(almondsCustomizer.prepareCustomProduct("Apples", "CoconutAlmonds", 10));
                    System.out.println(almondsCustomizer.prepareCustomProduct("Pears", "CoconutAlmonds", 25));
                    break;
                case "vegetables+RawCandyBar":
                    ItemFactory vegetableFactory = VegetableFactory.getVegetableFactory();
                    ItemFacade candyCustomizer1 = new ItemFacade(vegetableFactory);
                    System.out.println(candyCustomizer1.prepareCustomProduct("Carrots", "RawCandyBar", 12));
                    System.out.println(candyCustomizer1.prepareCustomProduct("Garlic", "RawCandyBar", 15));
                    System.out.println(candyCustomizer1.prepareCustomProduct("Onion", "RawCandyBar", 5));
                    System.out.println(candyCustomizer1.prepareCustomProduct("Potatoes", "RawCandyBar", 8));
                    break;
                case "vegetables+CoconutAlmonds":
                    ItemFactory vegetableFactory1 = VegetableFactory.getVegetableFactory();
                    ItemFacade almondsCustomizer1 = new ItemFacade(vegetableFactory1);
                    System.out.println(almondsCustomizer1.prepareCustomProduct("Carrots", "CoconutAlmonds", 12));
                    System.out.println(almondsCustomizer1.prepareCustomProduct("Garlic", "CoconutAlmonds", 15));
                    System.out.println(almondsCustomizer1.prepareCustomProduct("Onion", "CoconutAlmonds", 5));
                    System.out.println(almondsCustomizer1.prepareCustomProduct("Potatoes", "CoconutAlmonds", 8));
                    break;
                case "fresh-juice":
                    FreshJuice orangeJuice = new OrangeJuice();
                    Item adaptedJuice = new FreshJuiceAdapter(orangeJuice);
                    System.out.println(adaptedJuice.toString());
                    break;
                case "q":
                    break label;
                default:
                    System.out.println("Ops, we don't have this item. Try another)");
                    break;
            }
        }
    }
}
