package net.slimou.mockitodemo;

import net.slimou.mockitodemo.Item.Item;
import net.slimou.mockitodemo.ShoppingCart.Cart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CartTest {
    @InjectMocks
    Cart cart;
    @Mock
    Item item;

    @Before
    public void setup() {
        Cart cart = mock(Cart.class);
        cart.setId(42L);
        List<Item> listOfItems = new ArrayList<>();
        Item i1 = mock(Item.class);
        Item i2 = mock(Item.class);
        Item i3 = mock(Item.class);
        listOfItems.add(i1);
        listOfItems.add(i2);
        listOfItems.add(i3);
        cart.setListOfItems(listOfItems);
        when(i1.getName()).thenReturn("Rice");
        when(i2.getName()).thenReturn("Tea");
        when(i3.getName()).thenReturn("Wheat");
        when(i1.getPrice()).thenReturn(100.0);
        when(i2.getPrice()).thenReturn(200.0);
        when(i3.getPrice()).thenReturn(300.0);
    }

    @Test
    public void testCartCalculateBill() {
        Double billAmount = cart.calculateBill();
        Assert.assertEquals(600.0, Optional.ofNullable(billAmount));
    }

    @Test
    public void contextLoads() {
        Double billAmount = cart.demoMethod();
        Assert.assertTrue(billAmount == 42.0);
    }
}


