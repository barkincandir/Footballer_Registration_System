package classes;

import interfaces.Transferable;

public class TransferFacade {
    private Transferable transfer;

    public TransferFacade(int transferdegeri, int transferyili) {
        this.transfer = new BasicTransfer(transferdegeri, transferyili);
    }

    public int getTransferdegeri() {
        return transfer.getTransferdegeri();
    }

    public int getTransferyili() {
        return transfer.getTransferyili();
    }

    public void printTransferDetails() {
        System.out.println("Transfer Değeri: " + getTransferdegeri());
        System.out.println("Transfer Yılı: " + getTransferyili());
    }
}
