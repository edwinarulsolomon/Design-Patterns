package AdapterPattern;

public class ExternalAdapter implements Mobile{
    private ExternalClass cur;

    public ExternalAdapter(ExternalClass externalClass) {
        this.cur = externalClass;
    }

    @Override
    public String getName() {
        return cur.MobileName();
    }

    @Override
    public String getModel() {
        return cur.ModelName();
    }

    @Override
    public double getPrice() {
        return cur.MobilePrice();
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Model: " + getModel() + ", Price: " + getPrice();
    }

}
