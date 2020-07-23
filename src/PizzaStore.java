public class PizzaStore {
    PizzaFactory factory;
    public PizzaStore(PizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        return pizza;
    }


}
