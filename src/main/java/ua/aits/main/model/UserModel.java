/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.aits.main.model;

import java.sql.SQLException;

/**
 *
 * @author kiwi
 */
public class UserModel {
    
    public String user_name;
    public String user_login;
    public String user_password;
    public String user_number;
    public String user_xml_date;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }
    
    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_number() {
        return user_number;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public String getUser_xml_date() {
        return user_xml_date;
    }

    public void setUser_xml_date(String user_xml_date) {
        this.user_xml_date = user_xml_date;
    }
    
    
    public String isExitsUser(String user_login, String user_password) throws SQLException{
        if("admin".equals(user_login) && "admin".equals(user_password)) {
            return "0";
        }
        else {
            return "-1";
        }
    }
    
    
    
    public UserModel getOneUserFullById(String user_number) {
        UserModel user = new UserModel();
        if("0".equals(user_number)) {
            user.setUser_login("admin");
            user.setUser_name("admin");
            user.setUser_password("admin");
            user.setUser_number("0");
            user.setUser_xml_date("21.21.21");
            return user;
        } 
        if("1".equals(user_number)) {
            user.setUser_login("test");
            user.setUser_name("test");
            user.setUser_password("test");
            user.setUser_number("1");
            user.setUser_xml_date("21.21.21");
            return user;
        } 
        return null;
    }
}