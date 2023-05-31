package com.xiaohuo.libmanager.services;

/*
* @Author XU XIAO
* */

public abstract class VerifyService {
    public boolean UserStatus(String name){
        if (!UserStatus(name)){

        }else {
            System.out.println("Welcome back");
        }
        return false;
    }
}
