package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UITest {
    private UI ui;

    @Before
    public void setupInventoryTest() {
        this.ui = new UI();
    }
    @Test
    public void isValidItemTest() {
        boolean itemCodeCheck = ui.isValidItem("A1");
        assertEquals(true, itemCodeCheck);

        boolean itemCodeCheck1 = ui.isValidItem("B2");
        assertEquals(true, itemCodeCheck1);

        boolean itemCodeCheck2 = ui.isValidItem("C3");
        assertEquals(true, itemCodeCheck2);

        boolean itemCodeCheck3 = ui.isValidItem("D4");
        assertEquals(true, itemCodeCheck3);

        boolean itemCodeCheck4 = ui.isValidItem("E3");
        assertEquals(false, itemCodeCheck4);

        boolean itemCodeCheck5 = ui.isValidItem("D6");
        assertEquals(false, itemCodeCheck5);
    }
    @Test
    public void isValidQuantityTest() {
        boolean itemQuantityCheck = ui.isValidQuantity("A1",10);
        assertEquals(true, itemQuantityCheck);

        boolean itemQuantityCheck1 = ui.isValidQuantity("B2",5);
        assertEquals(true, itemQuantityCheck1);

        boolean itemQuantityCheck2 = ui.isValidQuantity("C3",7);
        assertEquals(true, itemQuantityCheck2);

        boolean itemQuantityCheck3 = ui.isValidQuantity("D4",2);
        assertEquals(true, itemQuantityCheck3);

        boolean itemQuantityCheck4 = ui.isValidQuantity("A2",11);
        assertEquals(false, itemQuantityCheck4);

        boolean itemQuantityCheck5 = ui.isValidQuantity("B3",20);
        assertEquals(false, itemQuantityCheck5);
    }
}
