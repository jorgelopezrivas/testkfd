/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.DeviceList;

import java.util.List;

/**
 *
 * @author koala 1
 */
public interface DeviceList {
    public abstract List<DeviceListNode> getAvailableDevices();    
}
