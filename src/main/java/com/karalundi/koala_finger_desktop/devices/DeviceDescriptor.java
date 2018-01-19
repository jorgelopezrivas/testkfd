/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;

import com.karalundi.koala_finger_desktop.config.MatcherConfig;

/**
 *
 * @author koala 1
 */
public class DeviceDescriptor {
    private String id;
    private String name;
    private String serialNumber;
    private String productName;
    private String vendorName;
    private String driverName;
    private String sessionId;

    public DeviceDescriptor(MatcherConfig config) {
        Session session = new Session(config);
        session.createSessionDir();
        this.sessionId = session.getSessionId();
    }
    
    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    
}
