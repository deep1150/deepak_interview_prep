package deepak_lld_prep.creational_pattern.singleton;

public class LoggerReflectionsSafe {
    private static LoggerReflectionsSafe instance;
    private static boolean instanceCreated = false;

    private LoggerReflectionsSafe() {
        if (instanceCreated) {
            throw new RuntimeException("Reflection is not allowed!");
        }
        instanceCreated = true;
    }

    public static LoggerReflectionsSafe getInstance() {
        if (instance == null) {
            instance = new LoggerReflectionsSafe();
        }
        return instance;
    }
}

