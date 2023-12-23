import java.util.HashMap;
import java.util.Map;

public class MyMenu {
    Map<String,MyMenuItem> myMenuItems;
    public MyMenu() {
        this.myMenuItems = new HashMap<>();
        this.myMenuItems.put("H",new Home());
        this.myMenuItems.put("O",new Orders());
        this.myMenuItems.put("P",new Products());
        this.myMenuItems.put("S",new Sales());
    }
}
