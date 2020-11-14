## Creational Design Patterns

#### Author: Savitchi Olivia

### Objectives:
1.  Study and understand the Creational Design Patterns;
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms;

3. Use some creational design patterns for object instantiation in a sample project.

### Some Theory
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

 - Abstract Factory (Creates an instance of several families of classes);
 - Builder (Separates object construction from its representation);
 - Factory Method (Creates an instance of several derived classes);
 - Object Pool (Avoid expensive acquisition and release of resources by recycling objects that are no longer in use);
 - Prototype (A fully initialized instance to be copied or cloned);
 - Singleton (A class of which only a single instance can exist);
 
### CDP.Main task 
1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed);

2. Select a domain area for the sample project;

3. Define the main involved classes and think about what instantiation mechanisms are needed;

4. Based on the previous point, implement atleast 3 creational design patterns in your project;
 
### Implementation and Explanation
In order to implement the Creational Design Patterns I used Java. The patterns that I had implemented are:
- Singleton
- Builder
- Abstract Factory
- Factory Method

#### Builder 
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In my project, firstly I created 7 classes (Apple.java, Carrot.java, Garlic.java, Onion.java, Orange.java, Pear.java, Potato.java), then by extracting the information I created the respective builder patterns(AppleBuilder.java, CarrotBuilder.java, GarlicBuilder.java, OnionBuilder.java, OrangeBuilder.java, PearBuilder.java, PotatoesBuilder.java).

```
 @Override
    public void setName(String name) {
        this.apple.setName(name);
    }
```

#### Singleton 
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object. This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class. In my project it looks like this:

```
 private static CDP.VegetableFactory vegetableFactory;

    public static CDP.VegetableFactory getVegetableFactory() {
        if(vegetableFactory == null)
            vegetableFactory = new CDP.VegetableFactory();
        return vegetableFactory;
    }
```

#### Abstract Factory
In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

```
public interface CDP.AbstractFactory {

    Item prepareForSale(String name);

}
```

#### Factory Method
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object. In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface. Thus, I used if - else statements to produce objects.

```
if(name.equalsIgnoreCase("CARROTS")){
            CarrotBuilder carrotBuilder = new CarrotBuilder();
            salesman.sellCarrot(carrotBuilder);
            return carrotBuilder.getItem();
        }

        else if(name.equalsIgnoreCase("GARLIC")){
            GarlicBuilder garlicBuilder = new GarlicBuilder();
            salesman.sellGarlic(garlicBuilder);
            return garlicBuilder.getItem();
        }
```

### Screenshots

![](../../img/Untitled.png)
