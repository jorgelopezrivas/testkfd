/*
 * Propiedad Intelectual de Karalundi. Todos los Derechos Reservados
 */
package com.karalundi.koala_finger_desktop.devices;

import com.karalundi.koala_finger_desktop.config.MatcherConfig;
/**
 *
 * @author jorgelr
 */
public class DeviceHandler {
    private Device device;
    
    DeviceHandler(String driverName, MatcherConfig config, int captureMode) {
        switch(driverName){
            case "FileDevice":
                device = new FileDevice(config, captureMode);
                break;
            case "UareU":
                device = new UareUDevice(config, captureMode);
                break;
        }        
    }
   
    public Boolean open(String deviceId){
        return this.device.open(deviceId);
    }
    
    public Boolean close(){
        return this.device.close();
    } 
    
    public String getStatus(){
        return this.device.getStatus();
    }
    
    public Boolean reset(){
        return this.device.reset();
    }
}
