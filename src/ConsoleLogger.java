public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Writing to console......");
        System.out.println(message);
    }
}
