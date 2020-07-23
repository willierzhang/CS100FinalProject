import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryPatternTest {

    @Test
    void orderCheesePizza() {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("cheese");
        assertEquals("Cheese Pizza", pizza.getName());
    }

    @Test
    void orderPepperoniPizza() {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("pepperoni");
        assertEquals("Pepperoni Pizza", pizza.getName());
    }

    @Test
    void orderHawaiianPizza() {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("hawaiian");
        assertEquals("Hawaiian Pizza", pizza.getName());
    }
    @Test
    void orderVeggiePizza() {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("veggie");
        assertEquals("Veggie Pizza", pizza.getName());
    }
}