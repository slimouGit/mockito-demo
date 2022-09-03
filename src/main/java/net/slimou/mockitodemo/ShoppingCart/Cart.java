package net.slimou.mockitodemo.ShoppingCart;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.slimou.mockitodemo.Item.Item;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private Long id;
    List<Item> listOfItems;
    public Double calculateBill()
    {
        Double total = 0.0;
        for (Item item:this.listOfItems) {
            total+=item.getPrice();
        }
        return total;
    }

    public Double demoMethod(){
        return 42.0;
    }
}
