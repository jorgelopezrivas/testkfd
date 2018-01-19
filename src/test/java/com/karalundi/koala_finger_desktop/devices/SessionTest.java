/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;

import com.karalundi.koala_finger_desktop.config.MatcherConfig;
import java.io.File;
import org.apache.commons.configuration.ConfigurationException;
import org.junit.Test;
import static org.junit.Assert.*;


public class SessionTest {
    
    public SessionTest() {
    }

    @Test
    public void testCreateSessionDir() throws ConfigurationException {    
        MatcherConfig config = new MatcherConfig();
        config.readConfigFile("C:\\KoalaFingerDesktop\\config\\matcher.properties");        
        Session session = new Session(config);
        assertNotNull(session.getSessionId());
        
        session.createSessionDir();
        File dir = new File("c:\\KoalaFingerDesktop" + File.separator + 
                "session" + File.separator + session.getSessionId());
        assertEquals(true, dir.exists());
        
    }
    
}
