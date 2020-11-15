# Structural Design Patterns

#### Author: *Savițchi Olivia*

### Table of content

* Objectives
* Some Theory
* Main Task
* Implementation and Explanation
* Results
* Status

## Objectives 

1. Study and understand the Structural Design Patterns;
2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user;
3. Implement some additional functionalities using structural design patterns;

## Some Theory
In Software Engineering, Structural Design Patterns are Design Patterns that ease the design by identifying a simple way to realize relationships between entities. They explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient. Structural Design Patterns are:
* *Adapter* - allows objects with incompatible interfaces to collaborate.
* *Bridge* - splits a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
* *Composite* - composes objects into tree structures and then work with these structures as if they were individual objects.
* *Decorator* -  attaches new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
* *Facade* -  provides a simplified interface to a library, a framework, or any other complex set of classes.
* *Flyweight* - fits more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
* *Proxy* - provides a substitute or placeholder for another object.

## Main task
By extending your project, implement atleast 3 structural design patterns in your project:
* The implemented design pattern should help to perform the tasks involved in your system;
* The object creation mechanisms/patterns can now be buried into the functionalities instead of using them into the client;
* There should only be one client for the whole system.

## Implementation and Explanation
The implemented Structural Design Pattern for this laboratory work are:

#### 1. Adapter
In my project, I created a new Interface *FreshJuice*. But, this interface is incompatible and need to be adapted. The main comunication platform is *Item* interface. So, I created a special object *FreshJuiceAdapter*, and now I have a connection betwwen *Item* and adaptee.
~~~
public class FreshJuiceAdapter implements Item {
    private final FreshJuice orangeJuice;

    public FreshJuiceAdapter(FreshJuice orangeJuice){
        this.orangeJuice = orangeJuice;
    }

    @Override
    public String toString() {
        return orangeJuice.toString();
    }
  ~~~
  
 #### 2. Decorator 
Extending a class is the first thing that comes to mind when we need to alter an object’s behavior. Therefore, I extended my project with an abstract decorator class *ItemDecorator* that implements tha *ItemFactory*. I created a *BonusDecorator* a concrete class, which also is extending *ItemDecorator*. So, I provideD a flexible alternative to subclassing for extending functionalities, thus at any purchased item, a Xmas Gift is given, and the client can choose between two type of bonuses.
~~~
public class ItemDecorator implements ItemFactory {

    protected ItemFactory decoratedItem;

    public ItemDecorator(ItemFactory decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    public Item prepareForSale(String name) {
        return decoratedItem.prepareForSale(name);
    }
}
~~~
~~~
public class BonusDecorator extends ItemDecorator {
    private final String givenBonus;

    public BonusDecorator(ItemFactory decoratedItem, String givenBonus) {
        super(decoratedItem);
        this.givenBonus = givenBonus;
    }

    @Override
    public Item prepareForSale(String name) {
        Item item = super.prepareForSale(name);
        item.setXmasBonus(this.givenBonus);
        return item;
    }
}
~~~

#### 3. Facade
In my project I created an *ItemFacade* that represents an entire subsystem. It provides an interface for the client. It allows to communicate with the Decorator design pattern classes.
~~~
public class ItemFacade {

    private final ItemFactory decoratedItem;

    public ItemFacade (ItemFactory decoratedItem) {

        this.decoratedItem = decoratedItem;
    }

    public Item prepareCustomProduct(String name, String givenBonus, float price) {
        ItemDecorator customizer = new BonusDecorator(decoratedItem, givenBonus);
        Item customItem = customizer.prepareForSale(name);
        customItem.setPrice(price);
        return customItem;
    }
}
~~~

## Results

![](https://github.com/oliviasv/TMPS/blob/main/SDP/img/img1.jpg)

![](https://github.com/oliviasv/TMPS/blob/main/SDP/img/img2.jpg)

## Status
*Finished*



