abstract class BasePizza extends Pizza{
    String dough;
    String sauce;
    double price;

    public String getDough(){
        return dough;
    }

    public String getSauce(){
        return sauce;
    }

    public double cost(){
        return price;
    }
}
