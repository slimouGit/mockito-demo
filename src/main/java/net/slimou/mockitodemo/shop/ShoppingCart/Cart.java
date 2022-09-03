package net.slimou.mockitodemo.shop.ShoppingCart;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.slimou.mockitodemo.shop.Item.Item;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private Long id;
    List<Item> listOfItems;
}
