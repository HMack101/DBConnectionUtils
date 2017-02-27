/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.configurationutils;

/**
 *
 * @author HMack101
 */
public class ReadTextConfigFile {
    
    private String filename = null;
    
    private String dbname  = null;
    private String dbuser = null;
    private String dbpassword = null;
    private String dbhost = "localhost";
    private int dbport = 5432;
    
    private String httpHost = "localhost";
    private String httpsHost = "localhost";   
    private int httpsPort = 443;
    private int httpPort = 80;
    
    
    public ReadTextConfigFile () {        
    }
    
    
    public ReadTextConfigFile(String filename) {
        this.filename = filename;
    }
    
    public String getConfigFilename() {
        return this.filename;
    }
    
    public void setConfigFilename(String filename) {
        this.filename = filename;
    }    
    
    public String getDBName () {
        return this.dbname;
    }
    
    public void setDBName(String databasename) {
        this.dbhost = databasename;
    }
        
    public String getDBUser() {
        return this.dbuser;
    }
    
    public void setDBUser (String username) {
        this.dbhost = username;
    }
    
    public String getDBPassword() {
        return this.dbpassword;
    }
    
    public void setDBPassword (String password) {
        this.dbpassword = password;
    }
        
    public String getDBHost () {
        return this.dbhost;
    }
    
    public void setDBHost (String host) {
        this.dbhost = host;
    }
       
    public int getDBPort () {
        return this.dbport;
    }
        
    public void setDBPort (int port) {
       this.dbport = port; 
    }
    
    public void setHTTPHost(String host) {
        this.httpHost = host;
    }
    
    public void setHTTPPort (int port) {
        this.httpPort = port;
    }
    
    public void setHTTPSHost (String host) {
        this.httpsHost = host;
    }
    
    public void setHTTPSPort (int port) {
        this.httpsPort = port;
    }
    
    public Object parse() {
        return this;
    }
}
