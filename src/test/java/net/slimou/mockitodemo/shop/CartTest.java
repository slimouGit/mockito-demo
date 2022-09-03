package net.slimou.mockitodemo.shop;


import net.slimou.mockitodemo.shop.Item.Item;
import net.slimou.mockitodemo.shop.ShoppingCart.Cart;
import net.slimou.mockitodemo.shop.ShoppingCart.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class CartTest {

    @Mock
    Cart cart;

    @InjectMocks
    CartService cartService;

    @Test
    public void testCartCalculateBill() {
        when(cart.getListOfItems()).thenReturn(new ArrayList<>(Arrays.asList(new Item(42l,"Banane",10.0),new Item(42l,"Gurke",10.0))));
        assertEquals(20.0, cartService.calculateBill(cart.getListOfItems()));
    }

    @Test
    public void testCartCalculateBillWithItemBuilder() {
        Item i1 = Item.builder().id(1L).name("I Pod").price(50.0).build();
        Item i2 = Item.builder().id(2L).name("Mouse").price(15.0).build();
        Item i3 = Item.builder().id(3L).name("Monitor").price(250.0).build();
        when(cart.getListOfItems()).thenReturn(new ArrayList<>(Arrays.asList(i1, i2, i3)));
        assertEquals(315.0, cartService.calculateBill(cart.getListOfItems()));
    }


}


