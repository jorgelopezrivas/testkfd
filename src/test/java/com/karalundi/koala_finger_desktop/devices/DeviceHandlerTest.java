/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.devices;

import com.karalundi.koala_finger_desktop.DeviceList.DeviceListHandler;
import com.karalundi.koala_finger_desktop.DeviceList.DeviceListNode;
import com.karalundi.koala_finger_desktop.config.MatcherConfig;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.configuration.ConfigurationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorgelr
 */
public class DeviceHandlerTest {
    
    public DeviceHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
     
   @Test
   public void testUareUAccess() throws ConfigurationException{
       DeviceListHandler dlh = new DeviceListHandler();
       List<DeviceListNode> nodes = new ArrayList<>();
       nodes = dlh.getAllDevices();
       
       MatcherConfig config = new MatcherConfig();
       config.readConfigFile("C:\\KoalaFingerDesktop\\config\\matcher.properties");
       DeviceHandler dh = new DeviceHandler("UareU", config, CaptureMode.FLAT_SINGLE_FINGER);
       //4500: $00$05ba&000a&0103{F82B3C01-18CC-BC49-8233-A923EC2D7C13}
       //5300: $00$05ba&000e&0001{768636ED-CED3-4A48-A20D-937D4AB6B5FC}
       assertEquals(true, dh.open("$00$05ba&000e&0001{768636ED-CED3-4A48-A20D-937D4AB6B5FC}"));
       System.err.println("asdf" + dh.getStatus());
       assertEquals(true, dh.close());            
   }
   
   @Test
   public void testUareUReset() throws ConfigurationException{
       DeviceListHandler dlh = new DeviceListHandler();
       List<DeviceListNode> nodes = new ArrayList<>();
       nodes = dlh.getAllDevices();
       
       MatcherConfig config = new MatcherConfig();
       config.readConfigFile("C:\\KoalaFingerDesktop\\config\\matcher.properties");
       DeviceHandler dh = new DeviceHandler("UareU", config, CaptureMode.FLAT_SINGLE_FINGER);
       //4500: $00$05ba&000a&0103{F82B3C01-18CC-BC49-8233-A923EC2D7C13}
       //5300: $00$05ba&000e&0001{768636ED-CED3-4A48-A20D-937D4AB6B5FC}
       assertEquals(true, dh.open("$00$05ba&000e&0001{768636ED-CED3-4A48-A20D-937D4AB6B5FC}"));
       assertEquals(true, dh.reset());
       assertEquals(true, dh.close());   
       
   }

}
