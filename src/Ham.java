public class Ham extends PizzaDecorator {
    Pizza pizza;
    double price = 1.49;

    public Ham(Pizza pizza){
        this.pizza = pizza;
    }

    public String getName(){
        return pizza.getName() + ", Ham";
    }

    public double cost(){
        return pizza.cost() + price;
    }
}
