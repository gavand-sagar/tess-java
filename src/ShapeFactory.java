import java.util.Dictionary;
import java.util.Hashtable;

public class ShapeFactory implements IShapeFactory{

    Dictionary<String,IMyShape> objects ;

    public ShapeFactory() {
        this.objects = new Hashtable<>();
        this.objects.put("r",new Rectangle());
        this.objects.put("s",new Square());
        this.objects.put("c",new Circle());
        this.objects.put("p",new Pentagon());
    }

    public IMyShape GetShape(String input) {
        return objects.get(input);
    }

}
