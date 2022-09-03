package net.slimou.mockitodemo.ShoppingCart;

import net.slimou.mockitodemo.Item.Item;

import java.util.List;

public class CartService {

    public Double calculateBill(List<Item> listOfItems)
    {
        Double total = 0.0;
        for (Item item:listOfItems) {
            total+=item.getPrice();
        }
        return total;
    }

}
