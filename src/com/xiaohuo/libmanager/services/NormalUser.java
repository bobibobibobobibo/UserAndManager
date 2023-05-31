package com.xiaohuo.libmanager.services;
/*
 * @Author XU XIAO
 * */
public class NormalUser{
    protected boolean loginStatus;
    protected String name;
    protected String password;
    protected boolean exit;

    public NormalUser(String name, String password)
    {
        this.loginStatus = loginStatus;
        this.name = name;
        this.password = password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public static void setLoginStatus() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public boolean getUserExit(){
        return exit;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String Add() {
        return name;
    }

}
