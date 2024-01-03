package org.example;


import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {

    @Test
    public void testGetMarker() {
        char marker = 'X';
        Player player = new Player(marker);
        assertEquals(marker, player.getMarker());
        assertNotEquals('O', player.getMarker());


    }
}