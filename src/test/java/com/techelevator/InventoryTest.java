package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {

        private Inventory inventory;
        private CashBox cashBox;

        @Before
        public void setupInventoryTest() {
            this.inventory = new Inventory();
            this.cashBox = new CashBox();
            cashBox.setBalance(10.00);
        }



        @Test
        public void displayingItemsForCustomer() {

           String displayItems = inventory.displayItemsForCustomer();
           assertEquals("A1 Potato Crisps $3.05 10\n" +
                   "A2 Stackers $1.45 10\n" +
                   "A3 Grain Waves $2.75 10\n" +
                   "A4 Cloud Popcorn $3.65 10\n" +
                   "B1 Moonpie $1.8 10\n" +
                   "B2 Cowtales $1.5 10\n" +
                   "B3 Wonka Bar $1.5 10\n" +
                   "B4 Crunchie $1.75 10\n" +
                   "C1 Cola $1.25 10\n" +
                   "C2 Dr. Salt $1.5 10\n" +
                   "C3 Mountain Melter $1.5 10\n" +
                   "C4 Heavy $1.5 10\n" +
                   "D1 U-Chews $0.85 10\n" +
                   "D2 Little League Chew $0.95 10\n" +
                   "D3 Chiclets $0.75 10\n" +
                   "D4 Triplemint $0.75 10\n", displayItems);

        }


    @Test
    public void displaySalesReportTest() {

        String displaySales = inventory.displaySalesReport();
        assertEquals("Potato Crisps|0\n" +
                "Stackers|0\n" +
                "Grain Waves|0\n" +
                "Cloud Popcorn|0\n" +
                "Moonpie|0\n" +
                "Cowtales|0\n" +
                "Wonka Bar|0\n" +
                "Crunchie|0\n" +
                "Cola|0\n" +
                "Dr. Salt|0\n" +
                "Mountain Melter|0\n" +
                "Heavy|0\n" +
                "U-Chews|0\n" +
                "Little League Chew|0\n" +
                "Chiclets|0\n" +
                "Triplemint|0\n" +
                "\n" +
                " ** TOTAL SALES ** $0.0", displaySales);

    }


    @Test
    public void dispenseItems() {

        String dispense = inventory.dispenseItem("A1", 5, cashBox);
        assertEquals("5 Potato Crisps Price: $3.05 Balance: $-5.0\n" +
                "Crunch Crunch, Yum!\n", dispense);

    }



    }
