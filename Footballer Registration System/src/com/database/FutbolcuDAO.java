package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Futbolcu;
import classes.Takim;

public class FutbolcuDAO {
    public List<Futbolcu> getAllFutbolcular() {
        List<Futbolcu> futbolcular = new ArrayList<>();
        String query = "SELECT * FROM futbolcular"; // Veritabanı tablonuzun adını kontrol edin

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int futbolcuid = rs.getInt("futbolcuid");
                int yas = rs.getInt("yas");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String ulke = rs.getString("ulke");
                String pozisyon = rs.getString("pozisyon");
                int toplamgol = rs.getInt("toplamgol");
                int toplamasist = rs.getInt("toplamasist");
                Double golreyting = rs.getDouble("golreyting");
                Double asistreyting = rs.getDouble("asistreyting");
                int macsayisi = rs.getInt("macsayisi");
                
                int takimID = rs.getInt("takimid");
                String takimadi = rs.getString("takimadi");
                int transferdegeri = rs.getInt("transferdegeri");
                int transferyili = rs.getInt("transferyili");
                
                Takim takim = new Takim(transferdegeri, transferyili, takimadi, takimID);

                Futbolcu futbolcu = new Futbolcu(futbolcuid, yas, ad, soyad, ulke, pozisyon, toplamgol, toplamasist, golreyting, asistreyting, macsayisi, takim);
                futbolcular.add(futbolcu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return futbolcular;
    }
}
