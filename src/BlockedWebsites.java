import java.util.HashMap;
import java.util.Map;

public class BlockedWebsites {
    static Map<String,String> getBlockedWebsites(){
        Map<String,String> temp = new HashMap<String,String>();
        temp.put("facebook.com","facebook.com");
        temp.put("instagram.com","instagram.com");
        temp.put("youtube.com","youtube.com");
        return temp;
    }

}
