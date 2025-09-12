public class BuilderPattern
{
    public static void main(String [] args)
    {
        Mobile mobile=new Mobile.MobileBuilder("normal","4G")
                .build();

        System.out.println(mobile);

        Mobile mobile1=new Mobile.MobileBuilder("Foldable","5G")
                .setProcessor("SnapDragon")
                .setRAM("16 GB")
                .build();

        System.out.println(mobile1);
    }
}