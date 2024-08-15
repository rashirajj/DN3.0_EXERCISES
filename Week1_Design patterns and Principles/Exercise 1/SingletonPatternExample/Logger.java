// src/Logger.java

public class Logger {
    // The single instance of the Logger class (eager initialization)
    private static final Logger instance = new Logger();
    
    // Private constructor to prevent instantiation
    private Logger() {
        // Private constructor logic here
    }
    
    // Public method to provide access to the instance
    public static Logger getInstance() {
        return instance;
    }
    
    // Example logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
