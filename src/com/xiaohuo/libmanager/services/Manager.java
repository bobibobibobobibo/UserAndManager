package com.xiaohuo.libmanager.services;
/*
 * @Author XU XIAO
 * */
public class Manager {
    public String name;
    public String password;
    public String[] member;
    public static int size = 10;

    public Manager(String name, String password){
        this.name = name;
        this.password = password;
    }

    public Manager() {
    }

    public String[] getMember(){
        return member;
    }

    public String[] setMember(){
        this.member = member;
        return new String[0];
    }
    public static Manager getName(){
        return null;
    }
    public static Manager getPassword(){
        return null;
    }

    public String setName(String name, Manager admin){
        return name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static int getSize(){
        return size;
    }
    public int setSize(){
        this.size = size;
        return 0;
    }


    public boolean Delete() {
        return false;
    }

    public void Add() {
    }

    public void CheckAdmin(){
    }

    //public void name() {
    //}

}

