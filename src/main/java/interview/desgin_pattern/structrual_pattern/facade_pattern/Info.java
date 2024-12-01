package deepak_lld_prep.structrual_pattern.facade_pattern;

/**
 * Definition:
 * The Facade Pattern provides a simplified interface to a complex subsystem.
 * It helps to hide the complexity of the subsystem and provides a
 * high-level interface that makes it easier to use.
 *
 * Real-Life Example:
 * Imagine you have a home theater system with multiple components:
 * a DVD player, a projector, a sound system, and a light control system.
 * Using these components together requires several steps, and their interactions can be complex.
 * The Facade Pattern can simplify this by providing a single interface to manage all these components.
 *
 *
 * Imagine that you must make your code work with a
 * broad set of objects that belong to a sophisticated library or framework.
 * Ordinarily, you’d need to initialize all of those objects, keep track of dependencies,
 * execute methods in the correct order, and so on.
 *
 *
 * Relations with Other Patterns*
 * Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable. Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.
 *
 * Abstract Factory can serve as an alternative to Facade when you only want to hide the way the subsystem objects are created from the client code.
 *
 * Flyweight shows how to make lots of little objects, whereas Facade shows how to make a single object that represents an entire subsystem.
 *
 * Facade and Mediator have similar jobs: they try to organize collaboration between lots of tightly coupled classes.
 *
 * Facade defines a simplified interface to a subsystem of objects, but it doesn’t introduce any new functionality. The subsystem itself is unaware of the facade. Objects within the subsystem can communicate directly.
 * Mediator centralizes communication between components of the system. The components only know about the mediator object and don’t communicate directly.
 * A Facade class can often be transformed into a Singleton since a single facade object is sufficient in most cases.
 *
 * Facade is similar to Proxy in that both buffer a complex entity and initialize it on its own. Unlike Facade, Proxy has the same interface as its service object, which makes them interchangeable.
 */
public class Info {
}
