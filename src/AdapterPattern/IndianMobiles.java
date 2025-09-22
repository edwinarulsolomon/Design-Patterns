package AdapterPattern;

public class IndianMobiles implements Mobile{
    private String name;
    private String model;
    private double price;

    public IndianMobiles(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Model: " + getModel() + ", Price: " + getPrice();
    }

}
