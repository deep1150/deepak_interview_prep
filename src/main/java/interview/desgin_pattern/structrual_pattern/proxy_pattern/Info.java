package deepak_lld_prep.structrual_pattern.proxy_pattern;


/**
 * The Proxy Pattern provides a surrogate or placeholder object,
 * which controls access to another object. It can be used to add additional
 * behavior when accessing an object (like lazy initialization, access control, logging, etc.)
 * without changing the object itself.
 *
 * Types of Proxy Patterns:
 * Virtual Proxy: Provides a placeholder for an expensive object and initializes it only when necessary.
 * Protection Proxy: Controls access to an object based on user permissions.
 * Remote Proxy: Manages communication with a remote object (e.g., in distributed systems).
 * Real-Life Example: Image Viewer (Virtual Proxy)
 * Scenario:
 * Imagine an image viewer application where loading large images is expensive in terms of time and memory.
 * We can use a Proxy Pattern to delay the loading of images until they are actually needed.
 *
 * Benefits of the Proxy Pattern:
 * Lazy Loading: The proxy allows the real object to be loaded only when needed, saving resources.
 * Access Control: Can be used to restrict access to certain parts of the object.
 * Additional Functionality: The proxy can add extra behavior (like logging, caching, etc.)
 * without modifying the real object.
 *
 *
 *
 * Relations with Other Patterns
 * With Adapter you access an existing object via different interface. With Proxy,
 * he interface stays the same. With Decorator you access the object via an enhanced interface.
 *
 * Facade is similar to Proxy in that both buffer a complex entity and initialize it on its own.
 * Unlike Facade, Proxy has the same interface as its service object, which makes them interchangeable.
 *
 * Decorator and Proxy have similar structures, but very different intents.
 * Both patterns are built on the composition principle, where one object is supposed to
 * delegate some of the work to another. The difference is that a Proxy usually manages the
 * life cycle of its service object on its own, whereas the composition of Decorators is always
 * controlled by the client.
 *
 */
public class Info {
}
