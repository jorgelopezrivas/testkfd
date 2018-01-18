/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;

/**
 *
 * @author jorgelr
 */
public class DeviceHandler {
    private Device device;
    
    DeviceHandler(String sdkName) {
        switch(sdkName){
            case "Dummy":
                //device = new DummyDevice();
                break;
            case "UareU":
                device = new UareUDevice();
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
