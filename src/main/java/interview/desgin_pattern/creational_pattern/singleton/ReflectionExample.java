package deepak_lld_prep.creational_pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Here, Reflection is used to call the private constructor,
 * creating multiple instances of the Logger class, which defeats the purpose of the Singleton pattern.
 */


public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get the private constructor of the Logger class
        Constructor<Logger> constructor = Logger.class.getDeclaredConstructor();

        //you can retrieve an array of Constructor objects by calling the getDeclaredConstructors() method

        // Bypass the private access modifier
        constructor.setAccessible(true);

        // Create two instances of Logger using reflection
        Logger logger1 = constructor.newInstance();
        Logger logger2 = constructor.newInstance();

        // Now we have two instances!
        System.out.println(logger1 == logger2);  // Output: false
    }
}
