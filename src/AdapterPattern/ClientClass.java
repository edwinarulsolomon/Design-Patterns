package AdapterPattern;
import java.util.ArrayList;
import java.util.List;

public class ClientClass {
    public static List<Mobile> getMobiles()
    {
        List<Mobile> mobiles=new ArrayList<>();
        mobiles.add(new IndianMobiles("Vivo","V28",25000.00));
        ExternalClass externalClass=new ExternalClass("Xiomi","XYZ-22",100000);
        mobiles.add(new ExternalAdapter(externalClass));
        return mobiles;
    }
}
