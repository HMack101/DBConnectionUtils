/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.databaseconnectionutils;

import com.hmack101.configurationutils.ConfigurationFileType;
import com.hmack101.configurationutils.ReadConfigFile;



/**
 *
 * @author HMack101
 */
public class DatabaseConfig {
    
    private ConfigurationFileType configType = ConfigurationFileType.json;
    private String configFilename = null;
    private String name = null;
    private String user = null;
    private String password = null;
    private String host = "localhost";
    private int port = 5432;
    
    public DatabaseConfig(ConfigurationFileType type) {
        this.configType = type;
    }
    
    public ConfigurationFileType getConfigurationFileType() {
        return this.configType;
    }
    
    public void getConfigurationFileType(ConfigurationFileType type) {
        this.configType = type;
    }
    public String getConfigFilename() {
        return this.configFilename;
    }
    
    public void getConfigFilename(String filename) {
        this.configFilename = filename;
    } 
    
    public String setName () {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
        
    public String getUser() {
        return this.user;
    }
    
    public void setUser (String user) {
        this.user = user;
    }
    
    public String setPassword() {
        return this.password;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
       
    public String setHost () {
        return this.host;
    }
    
    public void setHost (String host) {
        this.host = host;
    }
      
    public int getPort () {
        return this.port;
    }
        
    public void setPort (int port) {
       this.port = port; 
    }
           
    public void readCofigurationFile(String filename) {
        ReadConfigFile readObj = new ReadConfigFile(filename, configType);
        readObj.parse();
        
        if (!readObj.getDBName().isEmpty()) {
            this.setName(readObj.getDBName());
        }
        
        if (!readObj.getDBHost().isEmpty()) {
            this.setHost(readObj.getDBHost());
        }
        
        if (readObj.getDBPort() == 0) {
            this.setPort(readObj.getDBPort());
        }
        
        if (!readObj.getDBUser().isEmpty()) {
            this.setUser(readObj.getDBUser());
        }
        
        if (!readObj.getDBPassword().isEmpty()) {
            this.setPassword(readObj.getDBPassword());
        }
    }      
}
