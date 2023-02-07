# SWE Lab 5

Ahmad Salimi - 97106013

## Report

### Abstract Factory pattern

#### Write the tests

![](./screenshots/1-abstract-factory-tests.png)

We face compile error because the classes are not implemented yet.

#### Implement the `Weapon` interface

![](./screenshots/2-weapon.png)

#### Implement the `WeaponFactory` abstract class

![](./screenshots/3-weapon-factory.png)

#### Implement the `Crossbow` class having `Factory` companion object

![](./screenshots/4-crossbow.png)

#### Implement the `Katana` class having `Factory` companion object

![](./screenshots/5-katana.png)

#### Run the tests

![](./screenshots/6-abstract-factory-tests-passed.png)

### Prototype pattern

#### Write the tests

![](./screenshots/7-prototype-tests.png)

We face compile error because the classes are not implemented yet.

#### Implement the `ReportItemPrototype` interface

![](./screenshots/8-report-item-prototype.png)

#### Implement the `TextItem` class

![](./screenshots/9-text-item.png)

#### Implement the `ImageItem` class

![](./screenshots/10-image-item.png)

#### Run the tests

![](./screenshots/11-prototype-tests-passed.png)

### Builder pattern

#### Write the test

![](./screenshots/12-builder-test.png)

We face compile error because the classes are not implemented yet.

#### Implement the `FoodOrder` class, having a builder member

![](./screenshots/13-food-order.png)

#### Run the test

![](./screenshots/14-builder-test-passed.png)

## Answers to the questions

1. There have been introduced three classes of design patterns in the "Gang of Four" book. name them and explain each in 2 lines.

    - Creational Patterns: These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. Example patterns include Factory Method, Abstract Factory, and Singleton.

    - Structural Patterns: These patterns deal with object composition, creating relationships between objects to form larger structures. Example patterns include Adapter, Bridge, and Decorator.

    - Behavioral Patterns: These patterns focus on communication between objects, what goes on between objects and how they operate together. Example patterns include Observer, Iterator, and Command.

1. What category do the three used patterns belong to?

    All three belong to the Creational Patterns category.

1. What are the main differences between SOLID and patterns introduced in "Gang of Four"?

    SOLID refers to a set of five design principles for writing maintainable and scalable software. These principles are: Single Responsibility Principle, Open/Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle. SOLID provides a set of guidelines for designing software that is easy to change, maintain, and extend over time.

    Design patterns, on the other hand, are reusable solutions to common problems that arise in software design. The "Gang of Four" book introduced three main categories of design patterns: Creational, Structural, and Behavioral. Design patterns provide a way to capture and reuse proven solutions to design problems in a structured and repeatable way.

1. Which SOLID principle does the Singleton pattern violate?

    While the Singleton pattern is a popular and widely used pattern, it can violate the Single Responsibility Principle (SRP) of SOLID.

    The Single Responsibility Principle states that a class should have only one reason to change. A class that implements the Singleton pattern may have multiple responsibilities, as it has to manage its own creation and ensure it has only one instance. This can lead to tight coupling and make the class harder to maintain and test, as changes to the Singleton class can have wide-ranging effects on the rest of the system.
