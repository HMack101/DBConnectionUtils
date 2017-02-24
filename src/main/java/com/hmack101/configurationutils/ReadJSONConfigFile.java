/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.configurationutils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import org.json.simple.JSONArray;
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
    private String dbhost = null;
    private String dbport = null;
    
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
       
    public String getDBPort () {
        return this.dbport;
    }
        
    public void setDBPort (String port) {
       this.dbport = port; 
    }
    
    public void parse (String filename) {
        this.setConfigFilename(filename);
        this.parse();
    }
    
    public void parse () {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader(this.getConfigFilename()));
 
            JSONObject jsonObject = (JSONObject) obj;
            this.setDBName((String)jsonObject.get("dbname"));
            this.setDBUser((String)jsonObject.get("dbuser"));
            this.setDBPassword((String)jsonObject.get("dbpassword"));
            this.setDBHost((String)jsonObject.get("dbhost"));
            this.setDBPort((String)jsonObject.get("dbport"));                      
        } catch (Exception ex) {
            Logger.getLogger(ReadJSONConfigFile.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    
}
