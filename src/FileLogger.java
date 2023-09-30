public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Writing to File......");
        System.out.println("-------Message Start------");
        System.out.println(message);
        System.out.println("-------Message End--------");

    }
}
