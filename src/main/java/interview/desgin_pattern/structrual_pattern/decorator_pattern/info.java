package deepak_lld_prep.structrual_pattern.decorator_pattern;

/**
 * Decorator Pattern
 * Definition:
 * The Decorator Pattern allows behavior to be added to individual objects, either statically or dynamically,
 * without affecting the behavior of other objects from the same class. This is achieved by
 * wrapping the original object with a decorator class that enhances or modifies its behavior.
 *
 * Real-Life Example: Coffee Shop
 * Let's consider a coffee shop where customers can order different types of coffee,
 * and they can add various toppings like milk, sugar, whipped cream, etc.
 * The coffee type and toppings can vary, and the Decorator Pattern is ideal for dynamically adding
 * these extra features.
 *
 *
 * Explanation:
 * Component Interface (Coffee): Defines the base interface for both the core object (basic coffee) and the decorators.
 * Concrete Component (BasicCoffee): Implements the Coffee interface and represents a plain coffee.
 * Decorator Abstract Class (CoffeeDecorator): Extends the Coffee interface and contains a reference to the decorated object. Concrete decorators will add behavior to this base class.
 * Concrete Decorators (MilkDecorator, SugarDecorator, WhippedCreamDecorator): These classes extend the CoffeeDecorator and add extra functionality to the coffee.
 * Client Code: Demonstrates how decorators can be layered dynamically to create different variations of coffee.
 *
 */
public class info {
}
