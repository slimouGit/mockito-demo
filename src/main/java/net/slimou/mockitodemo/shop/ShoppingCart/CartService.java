package net.slimou.mockitodemo.shop.ShoppingCart;

import net.slimou.mockitodemo.shop.Item.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
