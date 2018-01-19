/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;

import java.io.File;
import java.util.UUID;

/**
 *
 * @author koala 1
 */
public class Session {
    private String sessionId = null;

    public Session() {
        this.sessionId = UUID.randomUUID().toString();
    }
    
    public Boolean createSessionDir(String storagePath){
        String sessionDir = storagePath + "\\" + this.sessionId;
        File file = new File(sessionDir);
        return file.mkdirs();
    }

    public String getSessionId() {
        return sessionId;
    }
    
    
    
}
