import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaDecoratorTest {
    @Test
    void HamDecoratorTest(){
        Pizza pizza = new CheesePizza();
        pizza = new Ham(pizza);
        assertEquals("Cheese Pizza, Ham", pizza.getName());
    }

    @Test
    void PepperoniDecoratorTest(){
        Pizza pizza = new CheesePizza();
        pizza = new Pepperoni(pizza);
        assertEquals("Cheese Pizza, Pepperoni", pizza.getName());
    }

    @Test
    void MushroomDecoratorTest(){
        Pizza pizza = new CheesePizza();
        pizza = new Mushroom(pizza);
        assertEquals("Cheese Pizza, Mushroom", pizza.getName());
    }

    @Test
    void TwoDecoratorsTest(){
        Pizza pizza = new CheesePizza();
        pizza = new Ham(pizza);
        pizza = new Mushroom(pizza);
        assertEquals("Cheese Pizza, Ham, Mushroom", pizza.getName());
    }
}