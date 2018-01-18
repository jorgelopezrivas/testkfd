package com.karalundi.koala_finger_desktop.DeviceList;
import com.karalundi.koala_finger_desktop.devices.Device;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koala 1
 */
public class DeviceListHandler {
    public List<DeviceListNode> getAllDevices(){
        
        // Read UareU connected devices list
        UareUDeviceList srcList = new UareUDeviceList();
        List<DeviceListNode> dstList = new ArrayList<>();
        dstList = srcList.getAvailableDevices();
        
        //Read other vendors
        //TODO: implement
        return dstList;
    }
}
