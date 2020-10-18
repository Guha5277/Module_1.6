package guhar4k.patterns.singleton;

public class Logger {
    static Logger logger;

    private Logger(){}

    public static Logger getInstance(){
        if (logger == null) logger = new Logger();
        return logger;
    }
}
