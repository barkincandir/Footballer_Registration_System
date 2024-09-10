package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import classes.TransferFacade;

public class TransferFacadeTest {

    @Test
    public void testBasicTransfer() {
        TransferFacade transferFacade = new TransferFacade(1000000, 2023);

        assertEquals(1000000, transferFacade.getTransferdegeri(), "Transfer değeri doğru olmalıdır");
        assertEquals(2023, transferFacade.getTransferyili(), "Transfer yılı doğru olmalıdır");
    }

    @Test
    public void testTransferDetails() {
        TransferFacade transferFacade = new TransferFacade(1500000, 2024);
        transferFacade.printTransferDetails();

        assertEquals(1500000, transferFacade.getTransferdegeri(), "Transfer değeri doğru olmalıdır");
        assertEquals(2024, transferFacade.getTransferyili(), "Transfer yılı doğru olmalıdır");
    }
}
