package deepak_lld_prep.behaviour_pattern.observer;


/**
 * Observer Pattern
 * Definition:
 * The Observer Pattern is a behavioral design pattern that defines a one-to-many relationship between objects.
 * When the subject (the object being observed) changes its state,
 * all of its observers (objects that are interested in the subject's state) are automatically notified and updated.
 * This pattern is useful when an object needs to notify other objects without needing to know the details about those objects.
 *
 * Key Concepts of Observer Pattern
 * Subject: The object being observed. It keeps a list of its observers and notifies them of any state changes.
 * Observers: The objects that are observing the subject. They get notified when the subject's state changes.
 * One-to-many relationship: One subject can have multiple observers.
 * Real-Life Example: News Subscription Service
 * Consider a news application where users (observers) can subscribe to a news channel (subject).
 * Whenever the news channel publishes a new article, all subscribed users are notified of the update.
 */
public class Info {
}
