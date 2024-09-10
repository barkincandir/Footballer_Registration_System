package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import classes.Match;
import classes.Futbolcu;
import classes.Takim;

public class MatchTest {

    private Match match;
    private Futbolcu futbolcu;

    @BeforeEach
    public void setUp() {
        match = new Match();
        Takim takim = new Takim(1000000, 2022, "Galatasaray", 1);
        futbolcu = new Futbolcu(1, 25, "Ahmet", "Yılmaz", "Türkiye", "Forvet", 10, 5, 7.5, 6.3, 20, takim);
        match.addObserver(futbolcu);
    }

    @Test
    public void testAddObserver() {
        assertTrue(match.getObservers().contains(futbolcu), "Observer should be added to the list");
    }

    @Test
    public void testRemoveObserver() {
        match.removeObserver(futbolcu);
        assertFalse(match.getObservers().contains(futbolcu), "Observer should be removed from the list");
    }

    @Test
    public void testNotifyObservers() {
        match.setStats(2, 1, 9.7, 8.9);
        assertEquals(12, futbolcu.getToplamgol(), "Toplam gol should be updated");
        assertEquals(6, futbolcu.getToplamasist(), "Toplam asist should be updated");
        assertEquals(9.7, futbolcu.getGolreyting(), "Gol reyting should be updated");
        assertEquals(8.9, futbolcu.getAsistreyting(), "Asist reyting should be updated");
    }
}
