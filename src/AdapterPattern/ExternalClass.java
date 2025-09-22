package AdapterPattern;

public class ExternalClass {
    private String name;
    private String model;
    private double price;

    public ExternalClass(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public String MobileName()
    {
        return name;
    }
    public String ModelName()
    {
        return model;
    }
    public double MobilePrice()
    {
        return price;
    }


}
