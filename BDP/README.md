# Behavioral Design Patterns

#### Author: *Savitchi Olivia*

### Table of content

* Objectives
* Some Theory
* Main Task
* Implementation and Explanation
* Results
* Status

## Objectives

1. Study and understand the Behavioral Design Patterns;
2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system;
3. Implement some additional functionalities using behavioral design patterns.

## Some Theory

In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication. Some of them aare:
* *Chain of responsibility* - A way of passing a request between a chain of objects
* *Command* - Encapsulate a command request as an object
* *Interpreter* - A way to include language elements in a program
* *Iterator* - Sequentially access the elements of a collection
* *Mediator* - Defines simplified communication between classes
* *Memento* - Capture and restore an object's internal state
* *Strategy* - Encapsulates an algorithm inside a class
* *Observer* - A way of notifying change to a number of classes

## Main task

1. By extending your project, implement as many behavioral design patterns as you need in your project:
    * The implemented design pattern should help to perform the tasks involved in your system;
    * The object creation mechanisms/patterns can now be buried into the functionalities instead of using them into the client;
    * The behavioral DPs can be integrated into you functionalities alongside the structural ones;
    * There should only be one client for the whole system;
2. Keep your files grouped (into packages/directories) by their responsibilities (an example project structure):
    * client;
    * domain;
    * utilities;
    * data(if applies);
3. Document your work in a separate markdown file according to the requirements presented below (the structure can be extended of course):
   * Topic of the laboratory work;
   * Author;
   * Introduction/Theory/Motivation;
   * Implementation & Explanation (you can include code snippets as well):
   * Indicate the location of the code snippet;
   * Emphasize the main idea and motivate the usage of the pattern;
   * Results/Screenshots/Conclusions;

## Implementation and Explanation

### Used Pattern

- [x] **Strategy**  The main intent of this Behavorial Pattern is:
   * Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.
   * Capture the abstraction in an interface, bury implementation details in derived classes.
So, in order to implement this patterns into my prject, I created a Strategy interface ``CardDiscount.java``.
```
public interface DiscountCard {
    float useDiscountCard(float price);
}
```
This interface sets out strategy and implements two classes ``GoldDiscountCard.java`` and ``SilverDiscountCard.java``. 
```
public class SilverDiscountCard implements DiscountCard{
    @Override
    public float useDiscountCard(float price) {
        return (float) (price * 0.9);
    }
}
```
```
public class GoldDiscountCard implements DiscountCard{
    @Override
    public float useDiscountCard(float price) {
        return (float) (price * 0.7);
    }
}
```
In the ``Client.java`` class, I used ``DiscountCardCondition.java`` to show how the behavior changes depending on the strategy chosen by the client.
```
public class DiscountCardCondition {
    private final DiscountCard discountCard;

    public DiscountCardCondition(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public float setNewPrice(float price) {
        return discountCard.useDiscountCard(price);
    }
}
```

## Results

![] (BDP/img/img1.jpg)
![] (BDP/img/img2.jpg)

## Status
- [x] *Finished*

