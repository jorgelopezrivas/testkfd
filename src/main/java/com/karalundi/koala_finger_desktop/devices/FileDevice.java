/*
 * Propiedad Intelectual de Karalundi. Todos los Derechos Reservados
 */
package com.karalundi.koala_finger_desktop.devices;

import com.karalundi.koala_finger_desktop.config.MatcherConfig;

/**
 *
 * @author koala 1
 */
public class FileDevice extends DeviceDescriptor implements Device {

    public FileDevice(MatcherConfig config, int captureMode) {
        super(config, captureMode);
    }

    @Override
    public Boolean open(String deviceId) {
        return true;
    }

    @Override
    public Boolean close() {
        return true;
    }

    @Override
    public String getStatus() {
        return "Device Ready";
    }

    @Override
    public void getCapabilities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calibrate() {
        
    }

    @Override
    public Boolean reset() {
        return true;
    }

    @Override
    public void capture() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelCapture() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
