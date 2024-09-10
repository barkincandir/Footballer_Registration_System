package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import classes.BasicTransfer;

public class BasicTransferTest {

    @Test
    public void testGetTransferdegeri() {
        int expectedTransferdegeri = 1000000;
        int transferyili = 2023;
        BasicTransfer basicTransfer = new BasicTransfer(expectedTransferdegeri, transferyili);
        
        int actualTransferdegeri = basicTransfer.getTransferdegeri();
        
        assertEquals(expectedTransferdegeri, actualTransferdegeri, "Transfer değeri doğru olmalıdır");
    }

    @Test
    public void testGetTransferyili() {
        int transferdegeri = 1000000;
        int expectedTransferyili = 2023;
        BasicTransfer basicTransfer = new BasicTransfer(transferdegeri, expectedTransferyili);
        
        int actualTransferyili = basicTransfer.getTransferyili();
        
        assertEquals(expectedTransferyili, actualTransferyili, "Transfer yılı doğru olmalıdır");
    }
}
