package AdapterPattern;

import java.util.List;

public class AdapterPattern {
    public static void main(String [] args)
    {
        List<Mobile> cur=ClientClass.getMobiles();
        for(Mobile m:cur)
        {
            System.out.println(m);
        }
    }
}
