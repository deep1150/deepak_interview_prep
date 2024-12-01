package deepak_lld_prep.creational_pattern.singleton;

public class ReadResolveIssue {
}


/**
 * The readResolve method is used as part of Java's deserialization mechanism.
 * When a class defines readResolve, that method will be called after the object is deserialized,
 * allowing the developer to replace the deserialized object with something else—in this case,
 * the existing Singleton instance
 */

//
//public class Logger implements Serializable {
//    private static final long serialVersionUID = 1L;
//    private static Logger instance;
//
//    private Logger() {}
//
//    public static Logger getInstance() {
//        if (instance == null) {
//            instance = new Logger();
//        }
//        return instance;
//    }
//
//    // This method ensures that the Singleton instance is returned during deserialization
//    protected Object readResolve() {
//        return getInstance();
//    }
//}