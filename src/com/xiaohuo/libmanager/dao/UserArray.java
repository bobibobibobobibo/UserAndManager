package com.xiaohuo.libmanager.dao;

/*
 * @Author XU XIAO
 * */
import com.xiaohuo.libmanager.services.Manager;
import com.xiaohuo.libmanager.services.NormalUser;

import java.util.Scanner;



public class UserArray{
    Manager manager = new Manager();
    String[] num = manager.getMember();
    public String[] Array(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i =0;i < num.length;i++){
            System.out.println(num[i]);
            }

        return new String[0];
    }

    public String[] getMember(){
        return num;
    }
    public void verifyNameExist(String name) {
    }



    public NormalUser add(String name, String password){
        NormalUser normalUser = new NormalUser(name, password);
        normalUser.Add();
        return normalUser;
    }

}
