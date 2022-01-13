// controls and manage access to the object they are protecting
import java.util.ArrayList;

interface Internet{
    public void connectTo(String serverHost) throws Exception;
}

class RealInternet implements Internet{
    @Override
    public void connectTo(String serverHost){
        System.out.println("Connecting to " + serverHost);
    }
}

class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();
    private static ArrayList<String> bannedSites;

    static{
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("123.net");
        bannedSites.add("npr.dev");
        bannedSites.add("drk.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception{
        if(bannedSites.contains(serverHost.toLowerCase()))
            throw new Exception("Access Denied");
        internet.connectTo(serverHost);
    }
}

public class ProxyPattern {
    public static void main(String[] args) {
        //client
        Internet internet = new ProxyInternet();

        try{
            internet.connectTo("yn.com");
            internet.connectTo("abc.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
            
    }
}
