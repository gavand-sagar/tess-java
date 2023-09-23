public class CompanyInternet implements  Internet{

    private Internet internet = new RealInternet();
    @Override
    public void ConnectTo(String websiteName) {

        if(BlockedWebsites.getBlockedWebsites().containsKey(websiteName)){
            System.out.println("Access Blocked: " + websiteName);
            return;
        }

        internet.ConnectTo(websiteName);

    }
}
