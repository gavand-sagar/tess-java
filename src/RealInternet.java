public class RealInternet implements  Internet{
    @Override
    public void ConnectTo(String websiteName) {
        System.out.println("Connected to : " + websiteName);
    }
}
