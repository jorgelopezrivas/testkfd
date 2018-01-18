/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karalundi.koala_finger_desktop.config;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
/**
 *
 * @author jorgelr
 */
public class MatcherConfig {
    private Boolean enableLocalMatcher;
    private Boolean enableNFIQValidation;
    private Boolean enableDuplicationCheck;
    private Boolean enableEncryption;
    private String endpoint;
    private String configName;
    private String enterpriseId;
    private String storagePath;

    public MatcherConfig() {
        this.enableLocalMatcher = null;
        this.enableNFIQValidation = null;
        this.enableDuplicationCheck = null;
        this.enableEncryption = null;
        this.endpoint = null;
        this.configName = null;
        this.enterpriseId = null;
        this.storagePath = null;
    }

    public void readConfigFile(String configFile) throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration(configFile);
        this.enableLocalMatcher = config.getBoolean("enableLocalMatcher");
        this.enableNFIQValidation = config.getBoolean("enableNFIQValidation");
        this.enableDuplicationCheck = config.getBoolean("enableDuplicationCheck");
        this.enableEncryption = config.getBoolean("enableEncryption");
        this.endpoint = config.getString("endpoint");
        this.configName = config.getString("configName");
        this.enterpriseId = config.getString("enterpriseId");
        this.storagePath = config.getString("storagePath");
    }
    
    public void writeConfigFile(String configFile) throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration(configFile);
        config.setProperty("enableLocalMatcher", this.enableLocalMatcher);
        config.setProperty("enableNFIQValidation", this.enableNFIQValidation);
        config.setProperty("enableDuplicationCheck", this.enableDuplicationCheck);
        config.setProperty("enableEncryption", this.enableEncryption);
        config.setProperty("endpoint", this.endpoint);
        config.setProperty("configName", this.configName);
        config.setProperty("enterpriseId", this.enterpriseId);
        config.setProperty("storagePath", this.storagePath);
    }
    
    @Override
    public String toString() {
        return "MatcherConfig{" + "enableLocalMatcher=" + enableLocalMatcher + 
                ", enableNFIQValidation=" + enableNFIQValidation + ", enableDuplicationCheck=" + 
                enableDuplicationCheck + ", enableEncryption=" + enableEncryption + ", endpoint=" + 
                endpoint + ", configName=" + configName + ", enterpriseId=" + enterpriseId + 
                ", storagePath=" + storagePath + '}';
    }
               
    public void setEnableLocalMatcher(Boolean enableLocalMatcher) {
        this.enableLocalMatcher = enableLocalMatcher;
    }

    public void setEnableNFIQValidation(Boolean enableNFIQValidation) {
        this.enableNFIQValidation = enableNFIQValidation;
    }

    public void setEnableDuplicationCheck(Boolean enableDuplicationCheck) {
        this.enableDuplicationCheck = enableDuplicationCheck;
    }

    public void setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public Boolean getEnableLocalMatcher() {
        return enableLocalMatcher;
    }

    public Boolean getEnableNFIQValidation() {
        return enableNFIQValidation;
    }

    public Boolean getEnableDuplicationCheck() {
        return enableDuplicationCheck;
    }

    public Boolean getEnableEncryption() {
        return enableEncryption;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getConfigName() {
        return configName;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public String getStoragePath() {
        return storagePath;
    }
    
    
    
}
