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
public class ReadXMLConfigFile {
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
    
    public ReadXMLConfigFile () {        
    }
    
    
    public ReadXMLConfigFile(String filename) {
        this.filename = filename;
    }
    
    public Object parse() {
        return this;
    }  
}
