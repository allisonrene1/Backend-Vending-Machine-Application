package com.techelevator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CashBoxTest {
    private CashBox cashBox;

    @Before
    public void fillCashBox() {
        this.cashBox = new CashBox();

    }

    @Test
    public void returnChangeReturnsChange() {
        cashBox.setBalance(12.0);
        String change = cashBox.returnChange();
        assertEquals("48 quarters,0 dimes,0 nickels",change);

        cashBox.setBalance(2.65);
        String change1 = cashBox.returnChange();
        assertEquals("10 quarters,1 dimes,1 nickels",change1);

        cashBox.setBalance(7.45);
        String change2 = cashBox.returnChange();
        assertEquals("29 quarters,2 dimes,0 nickels",change2);
    }


    //TODO: returnChange test
    //  - accepts any balance
    //  - returns accurate change
    //  - ends with correct string and balance

}
