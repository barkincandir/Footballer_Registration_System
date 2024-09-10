package classes;

import interfaces.Transferable;

public class BasicTransfer implements Transferable {
    private int transferdegeri;
    private int transferyili;

    public BasicTransfer(int transferdegeri, int transferyili) {
        this.transferdegeri = transferdegeri;
        this.transferyili = transferyili;
    }

    @Override
    public int getTransferdegeri() {
        return transferdegeri;
    }

    @Override
    public int getTransferyili() {
        return transferyili;
    }
}
