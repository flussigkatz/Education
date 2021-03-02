package Module13;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

class Pizzeria{
    String pizzaName;
    static BlockingDeque kitchen;

    public Pizzeria() {
        this.pizzaName = pizzaName;
        this.kitchen = new LinkedBlockingDeque(2);
    }

    public void order (String pizzaName) throws InterruptedException {
        System.out.println(pizzaName);
        kitchen.offerLast(pizzaName, 750, TimeUnit.MILLISECONDS);
        long t1 = System.currentTimeMillis();

    }

}
