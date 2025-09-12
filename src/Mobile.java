public class Mobile {
    private final String ram;
    private final String processor;
    private final String model;
    private final String network;
    private Mobile (String ram, String processor, String model, String network)
    {
        this.ram=ram;
        this.processor=processor;
        this.model=model;
        this.network=network;
    }

    public static class MobileBuilder
    {
        private  String ram;
        private  String processor;
        private final String model;
        private final String network;
        public MobileBuilder(String model, String network)
        {
            this.model=model;
            this.network=network;
        }

        public MobileBuilder setRAM(String ram)
        {
            this.ram=ram;
            return this;
        }

        public MobileBuilder setProcessor(String processor)
        {
            this.processor=processor;
            return this;
        }

        public Mobile build()
        {
            return new Mobile(ram,processor,model,network)gi;
        }
    }

    @Override
    public String toString() {
        return "Mobile Specification: " +
                "[ Model='" + model + '\'' +
                ", Network='" + network + '\'' +
                ", Ram='" + ram + '\'' +
                ", Processor='" + processor + '\'' +
                " ]";
    }

}
