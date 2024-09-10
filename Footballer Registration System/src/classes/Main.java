package classes;

import java.util.List;

import com.database.FutbolcuDAO;

public class Main {
    public static void main(String[] args) {
    	FutbolcuDAO futbolcuDAO = new FutbolcuDAO();
        List<Futbolcu> futbolcular = futbolcuDAO.getAllFutbolcular();

        Match match = new Match();

        // Maça futbolcuları ekle
        for (Futbolcu futbolcu : futbolcular) {
            match.addObserver(futbolcu);
        }

        // Maç istatistiklerini güncelle
        match.setStats(2, 1, 9.7, 8.9);

        // Güncellenen futbolcu bilgilerini yazdır
        for (Futbolcu futbolcu : futbolcular) {
            futbolcu.yazdir();
        }
        
        /*
        TransferFacade transferFacade = new TransferFacade(1000000, 2023);
        transferFacade.printTransferDetails();
        */
    }
}
