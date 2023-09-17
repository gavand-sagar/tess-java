public class ServerFacade  {

    private Server server;
    public ServerFacade() {
        server = new Server();
    }
    public ServerFacade(Server server) {
        this.server = server;
    }
    public  void startServer(){
        server.boot();
        server.readConfig();
        server.initialize();
    }


    public  void shutdownServer(){
        server.destroy();
        server.shutdown();
    }


}
