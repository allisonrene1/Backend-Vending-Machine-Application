package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FileReaderTest {
    private FileReader fileReader;

    @Before
    public void setupInventoryTest() {
        this.fileReader = new FileReader();
    }
    @Test
    public void restockVendingMachineTest() {
        TreeMap itemList = fileReader.restockVendingMachine();
        assertNotNull(itemList);
    }
}
