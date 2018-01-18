/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;
import com.digitalpersona.uareu.*;
//import com.digitalpersona.uareu.Reader.Description;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorgelr
 */
public class UareUDevice extends DeviceDescriptor implements Device {

    private Reader reader;
        
    @Override
    public Boolean open(String deviceId) {
        try {
            ReaderCollection srcList = UareUGlobal.GetReaderCollection();
            srcList.GetReaders();
            // Pendiente arreglar el indice en 0, implementar busqueda
            /*Buscar el deviceId para obtener el indice. El indice es 
            necesario para seleccionar el dispositivo*/
            Boolean deviceExists = false;
            int deviceIndex = -1;
            for(int i = 0; i < srcList.size(); i++){
                if(srcList.get(i).GetDescription().name.equals(deviceId)){
                    deviceExists = true;
                    deviceIndex = i;
                    break;
                }
            }
            if(deviceExists){
                this.reader = srcList.get(deviceIndex);
                this.reader.Open(Reader.Priority.COOPERATIVE);
                return true;
            }
            else {
                return false;
            }
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Boolean close() {
        try {
            this.reader.Close();
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String getStatus() {        
        try {
            return this.reader.GetStatus().toString();
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    @Override
    public void getCapabilities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calibrate() {
        try {
            this.reader.Calibrate();
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Boolean reset() {
        try {
            this.reader.Reset();
            return true;
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void capture() {
        try {
            this.reader.Capture(Fid.Format.ANSI_381_2004,Reader.ImageProcessing.IMG_PROC_DEFAULT,0, 0);
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cancelCapture() {
        try {
            this.reader.CancelCapture();
        } catch (UareUException ex) {
            Logger.getLogger(UareUDevice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
