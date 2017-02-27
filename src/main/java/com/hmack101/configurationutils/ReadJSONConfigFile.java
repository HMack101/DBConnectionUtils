/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.configurationutils;

import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author HMack101
 */
public class ReadJSONConfigFile {
    
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
    
    public ReadJSONConfigFile() {
        
    }
    
    
    public ReadJSONConfigFile(String filename) {
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
    
    public String getHTTPHost () {
        return this.httpHost;
    }
    
    public void setHTTPHost (String host) {
        this.httpHost = host;
    }
    
    public int getHTTPPort () {
        return this.httpPort;
    }
    
    public void setHTTPPort (int port) {
        this.httpPort = port;
    }
    
    public String getHTTPSHost () {
        return this.httpsHost;
    }
    
    public void setHTTPSHost (String host) {
        this.httpsHost = host;
    }
    
    public int getHTTPSPort () {
        return this.httpsPort;
    }
    
    public void setHTTPSPort (int port) {
        this.httpsPort = port;
    }
    
    
    
    public Object parse (String filename) {
        this.setConfigFilename(filename);
        return this.parse();
    }
    
    public Object parse () {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader(this.getConfigFilename()));
 
            JSONObject jsonObject = (JSONObject) obj;
            this.setDBName((String)jsonObject.get("dbName"));
            this.setDBUser((String)jsonObject.get("dbUser"));
            this.setDBPassword((String)jsonObject.get("dbPassword"));
            this.setDBHost((String)jsonObject.get("dbHost"));
            this.setDBPort((int)jsonObject.get("dbPort"));           
            this.setHTTPHost((String)jsonObject.get("httpHost"));
            this.setHTTPPort((int)jsonObject.get("httpPort"));
            this.setHTTPSHost((String)jsonObject.get("httpsHost"));
            this.setHTTPSPort((int)jsonObject.get("httpsPort"));            
            
        } catch (Exception ex) {
            Logger.getLogger(ReadJSONConfigFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this;            
    }
    
    
}
