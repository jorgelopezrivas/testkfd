/*
 * Propiedad Intelectual de Karalundi. Todos los Derechos Reservados
 */
package com.karalundi.koala_finger_desktop.DeviceList;

/**
 *
 * @author koala 1
 */
public class DeviceListNode {
    private String id;
    private String name;
    private String serialNumber;
    private String productName;
    private String vendorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
      
    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    
    
}
