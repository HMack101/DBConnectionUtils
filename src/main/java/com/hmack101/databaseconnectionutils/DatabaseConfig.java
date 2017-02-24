/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.databaseconnectionutils;

import com.hmack101.configurationutils.ConfigurationFileType;
import com.hmack101.configurationutils.ReadJSONConfigFile;


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
    private String host = null;
    private String port = null;
    
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
      
    public String setPort () {
        return this.port;
    }
        
    public void setPort (String port) {
       this.port = port; 
    }
    
    public DatabaseConfig readConfigurationFile(String filename) {
        if (this.configType == ConfigurationFileType.json) {
            this.readJSONCofigurationFile(filename);
        }
        
        if (this.configType == ConfigurationFileType.xml) {
            this.readXMLConfigurationFile(filename);
        }
                
        if (this.configType == ConfigurationFileType.text) {
            this.readTextConfigurationFile(filename);
        }
          
        return this;
    }
        
    public void readJSONCofigurationFile(String filename) {
        ReadJSONConfigFile readObj = new ReadJSONConfigFile(filename);
        readObj.parse();
        this.setName(readObj.getDBName());
        this.setHost(readObj.getDBHost());
        this.setPort(readObj.getDBPort());
        this.setUser(readObj.getDBUser());
        this.setPassword(readObj.getDBPassword());
    }
    
    public void readXMLConfigurationFile(String filename) {
        
    }
    
    public void readTextConfigurationFile(String filename) {
        
    }
    
}
