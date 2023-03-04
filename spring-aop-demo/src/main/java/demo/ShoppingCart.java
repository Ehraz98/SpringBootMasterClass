package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String s)
    {
        System.out.println("Checkout Called "+ s);
    }

}
