/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.aits.main.functions;

/**
 *
 * @author kiwi
 */
public class Constants
{
    public static final String URL = "/AITS/";
    public static final String home = "/home/kiwi/Development/NetBeansProjects/AITS_main/src/main/webapp/"; 
    
    public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_CONNECTION_STRING = "jdbc:mysql://localhost:3306/aits?characterEncoding=UTF-8";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "Iskompas4!";
    
    public String getURL()
    {
        return URL;
    }
    
    public String getDB_DRIVER()
    {
        return DB_DRIVER;
    }
    
    public String getDB_CONNECTION_STRING()
    {
        return DB_CONNECTION_STRING;
    }
    
    public String getDB_USER()
    {
        return DB_USER;
    }
    
    public String getDB_PASSWORD()
    {
        return DB_PASSWORD;
    }
    
}
