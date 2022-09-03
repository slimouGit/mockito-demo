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


}


