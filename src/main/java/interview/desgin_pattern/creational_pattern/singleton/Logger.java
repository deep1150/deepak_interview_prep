package deepak_lld_prep.creational_pattern.singleton;

public class Logger {
    // Step 1: Private static instance (lazily initialized)
    private static Logger instance;

    // Step 2: Private constructor to prevent outside instantiation
    private Logger() {
        // initialization code
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {

            // Use synchronized blocks or the "double-checked locking" approach
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    /**
     *
     * Let's clarify the difference between synchronized (Logger.class) {} and synchronized {}.
     * 1. synchronized (Logger.class) {}
     * Logger.class: This refers to the class-level lock.
     * In this case, you are synchronizing on the Logger.
     * class object, which means only one thread across the entire application can enter this synchronized block at any time,
     * because Logger.class is a single object that represents the class in memory.
     *
     * Use Case: When you want to ensure that a block of code is executed by only one thread across the entire application,
     * regardless of how many instances of Logger exist.
     * This is typically used when you're dealing with static fields or methods,
     * or when you want to lock access to some shared resource at the class level
     * (like in a Singleton pattern where only one instance should be created).
     */

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}