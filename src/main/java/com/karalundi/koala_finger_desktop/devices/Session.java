/*
 * Propiedad Intelectual de Karalundi. Todos los Derechos Reservados
 */
package com.karalundi.koala_finger_desktop.devices;

import com.karalundi.koala_finger_desktop.config.MatcherConfig;
import java.io.File;
import java.util.UUID;

/**
 *
 * @author koala 1
 */
public class Session {
    private String sessionId = null;
    private MatcherConfig config;

    public Session(MatcherConfig config) {
        this.sessionId = UUID.randomUUID().toString();
        this.config = config;
    }
    
    public Boolean createSessionDir(){
        String sessionDir = config.getStoragePath() + File.separator +
                "session" + File.separator + this.sessionId; 
        File file = new File(sessionDir);
        return file.mkdirs();
    }

    public String getSessionId() {
        return sessionId;
    }
    
    
    
}
