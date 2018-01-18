/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.DeviceList;
import com.karalundi.koala_finger_desktop.DeviceList.DeviceList;
import com.digitalpersona.uareu.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koala 1
 */
public class UareUDeviceList implements DeviceList{    
    @Override
    public List<DeviceListNode> getAvailableDevices() {
        try {
            // Read all connected devices
            ReaderCollection srcList = UareUGlobal.GetReaderCollection();
            srcList.GetReaders();
            
            //Add all UareU connected devices to dstList
             List<DeviceListNode> dstList = new ArrayList<>();
            DeviceListNode node;
            for(int i = 0; i < srcList.size(); i++){
                node = new DeviceListNode();
                node.setId(srcList.get(i).GetDescription().name);
                node.setName(srcList.get(i).GetDescription().name);
                node.setSerialNumber(srcList.get(i).GetDescription().serial_number);
                node.setProductName(srcList.get(i).GetDescription().id.product_name);
                node.setVendorName(srcList.get(i).GetDescription().id.vendor_name);
                dstList.add(node);
            }
            return dstList;
            
            } catch (UareUException ex) {
                Logger.getLogger(UareUDeviceList.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }   
    }
}
       
        