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
public interface Device {
    public abstract Boolean open(String deviceId);
    public abstract Boolean close();
    public abstract String getStatus();
    public abstract void getCapabilities();
    public abstract void calibrate();
    public abstract Boolean reset();
    public abstract void capture();
    public abstract void cancelCapture();
}
