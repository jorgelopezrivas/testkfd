/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koala 1
 */
public class SessionTest {
    
    public SessionTest() {
    }

    /**
     * Test of createSessionDir method, of class Session.
     */
    @Test
    public void testSessionIdCreation() {
        Session session = new Session();
        String sessionId = session.getSessionId();
        assertNotNull(this);
    }
    
    @Test
    public void testCreateSessionDir() {    
        Session session = new Session();
        session.createSessionDir("c:\\KoalaFingerDesktop");
        File dir = new File("c:\\KoalaFingerDesktop" + "\\" + session.getSessionId());
        assertEquals(true, dir.exists());
    }
    
}
