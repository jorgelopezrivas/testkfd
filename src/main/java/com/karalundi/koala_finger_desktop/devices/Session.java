/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
